package adapter;

public class Input {
	private String name;
	private String format;
	
	public Input(String name, String format){
		this.name= name;
		this.format=format;	
	}
	
	public void play(){
		System.out.println("I am an Input with name " + name + format);
	}
	
	public String getName(){
		return name;
	}
	
	public String getFormat(){
		return format;
	}
}
