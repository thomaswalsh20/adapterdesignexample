package adapter;

public class File {
	
	private String name;
	private String format;
	
	public File(String name, String format){
		this.name= name;
		this.format=format;	
	}
	
	public void play(){
		System.out.println("I am a file with name " + name + format);
	}
	
	public String getName(){
		return name;
	}
	
	public String getFormat(){
		return format;
	}
}
