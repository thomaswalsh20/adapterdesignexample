package adapter;

public class TheoraDeCoder implements Codec {
	private String type;
	
	public TheoraDeCoder(){
		this.type= "Theora";
	}
	@Override
	public void deCode(Input in) throws UnSupportedFormatException {
		
		if(in.getFormat().equals(type)){
			in.play();
		}
		else throw new UnSupportedFormatException("This is a TheoraDeCoder but you tried to play a file of type " + in.getFormat());
	
	}

}
