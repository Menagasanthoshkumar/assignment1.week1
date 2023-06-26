package week1.day1;

public class Car {
	int speed=60;
	
	private void soundHourn() {
		int speed=30;
		System.out.println("sound Hourn");
		
		}
	public void applyBreake() {
		System.out.println("Apply Breake");
		
	}

	public static void main(String[] args) {
		String name = "Testleaf";
		Car obj = new Car();
		obj.soundHourn();
		obj.applyBreake();
		System.out.println("Welcome to TestLeaf");
		
		
		

	}

}
