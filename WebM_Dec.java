package adapter;

public class WebM_Dec implements XDeCode {
	
	private String type;
	
	public WebM_Dec(){
		this.type="WebM";
	}
	
	@Override
	public void input(File file) {
		file.play();	
	}

	@Override
	public String getType() {
		return type;
	}

}
