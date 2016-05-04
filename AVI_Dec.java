package adapter;

public class AVI_Dec implements XDeCode{
	
	private String type;
	
	public AVI_Dec(){
		this.type="Avi";
	}
	
	@Override
	public void input(File file) {
		file.play();	
	}
	
	public String getType(){
		return type;
	}
}
