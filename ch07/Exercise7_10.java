class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setChannel(int channel) {
		if(channel<MIN_CHANNEL || channel>MAX_CHANNEL) return;
		prevChannel = this.channel;
		this.channel = channel;
	}
	
	public int getChannel() {
		return this.channel;
	}
	
	public void setVolum(int volume) {
		if(volume<MIN_VOLUME || volume>MAX_VOLUME) return;
		this.volume = volume;
	}
	
	public int getVolume() {
		return this.volume;
	}
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
	
}
public class Exercise7_10 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		t.setVolum(20);
		System.out.println("VOL:" + t.getVolume());
	}
}
