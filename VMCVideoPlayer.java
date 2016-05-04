package adapter;

//VMC Player plays the audio files through a Codec object which it is given. 
public class VMCVideoPlayer {
	
	private Codec codec;
	
	public VMCVideoPlayer(Codec codec){
		this.codec=codec;
	}
	
	public void changeCodec(Codec codec){
		this.codec=codec;
	}
	
	//this try/catch will catch any exceptions which occur in relation to playing of an Unsupported File Format. 
	public void play(Input in){
		try {
			codec.deCode(in);
		} catch (UnSupportedFormatException e) {
			e.printStackTrace();
		}
	}
}
