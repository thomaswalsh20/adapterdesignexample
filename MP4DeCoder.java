package adapter;

public class MP4DeCoder implements Codec {
	
	private String type;
	
	public MP4DeCoder(){
		this.type= "MP4";
	}
	
	@Override
	public void deCode(Input in) throws UnSupportedFormatException {
		if(in.getFormat().equals(type)){
			in.play();
		}
		else throw new UnSupportedFormatException("This is a MP4DeCoder but you tried to play a file of type " + in.getFormat());
	
	}

}
