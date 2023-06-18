package week1.day1;

public class Mobile1 {
	public void makeCall() {
		String mobileModel = " I Phone 11";
		float  mobileWeight = 0.8f;
		System.out.println("Make a call from" + mobileModel + "weighing of " + mobileWeight );
				
	

	}
	public void sendSms() {
		boolean isFullCharged = true;
		int mobileCost = 500000;
		System.out.println("sending a message of Yes its" + isFullCharged + "Mobile is fully charged" + "and cast of this mobile Rs." + mobileCost );
		

	}

	public static void main(String[] args) {
		Mobile1 myMobile = new Mobile1();
		System.out.println("This is my mobile");
		myMobile.makeCall();
		myMobile.sendSms();
	
		

	}

}
