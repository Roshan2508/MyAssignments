package week1.day1;

public class NewMobile {
	public void sendSms() {
		System.out.println("Hello Test Leaf");

	}
	protected void allowVoiceCall() {
		System.out.println("Hi");

	}
	private void takeVideo() {
		System.out.println("Video");

	}
	
	public static void main(String[] args) {
		NewMobile obj=new NewMobile();
		obj.allowVoiceCall();
		obj.sendSms();
		obj.takeVideo();
		
		
	}

}
