package week1.day1;



public class Mobile {
	
	public void sendSMS() {
		System.out.println("Sending message");
		System.out.println("Message Sent");
		
	}
	
	public void allowVoiceCall() {
		System.out.println("Allowing voice call");
		
	}
	private void takeVideo() {
		System.out.println("Recording Video");
		
	}

	public static void main(String[] args) {
		Mobile obj = new Mobile();
		obj.allowVoiceCall();
		obj.takeVideo();
		obj.sendSMS();
	
		

	}

}
