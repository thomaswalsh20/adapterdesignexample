package adapter;

import java.util.HashMap;

public class XDecodeAdapter implements Codec{
	
	private HashMap<String, XDeCode> adaptees;
	
	
	public XDecodeAdapter(){
		this.adaptees = new HashMap<String, XDeCode>();
	}
	
	//this method converts the specific Input into a format that can be played by the XDeCode library namely File. We can then use the XDeCode library
	@Override
	public void deCode(Input in) throws UnSupportedFormatException {
		String name= in.getName();
		String format = in.getFormat();
		
		//the specific format of the Input is checked to see if a suitable player exists in the XDeCode library ie in HashMap adaptees
		XDeCode adaptee = adaptees.get(format);
		
		//if it is supported convert to a File and call the input method on the adaptee XDeCode
		if(adaptee != null){
			File file = new File(name, format);
			adaptee.input(file);
		}
		//if it is not supported throw a new exception 
		else{
			throw new UnSupportedFormatException("The input type specified is not supported by this Adapter");
		}
		
	}
	
	//the XDeCode are stored in the HashMap under the String which idenitifies which format they can play
	public void addXDeCode(XDeCode adaptee){
		adaptees.put(adaptee.getType(),adaptee);
	}
	
}
