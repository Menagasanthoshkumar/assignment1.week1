package week1.day1;

public class Bike {
	
	public void applyBreake () {
		System.out.println("C-Applied Break");
		
	}
	
	public void soundHorn() {
		System.out.println("C-Sound Horn");
		
	}
	
	

	public static void main(String[] args) {
		
		Bike obj = new Bike();
		obj.applyBreake();
		obj.soundHorn();
		

	}

}
