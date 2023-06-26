package week1.day1;

public class Mobile1 {
	public void makeCall() {
		String mobileModel="Google pixel 3";
		float mobileWeight=0.200f;
		System.out.println("Make a call");
		System.out.println("mobilemodel");
		System.out.println("mobileWeight");
		
	}
	
	public void sendMsg() {
		boolean fullcharged =true;
		int mobileCost=600;
		
		System.out.println("Message Sent");
		System.out.println("fullycharged");
		System.out.println("mobilecost");
		
		
		
	}
	public static void main(String[] args) {
		Mobile1 obj = new Mobile1();
		obj.makeCall();
		obj.sendMsg();
		System.out.println("This is My mobile");
		
	}
	

}
