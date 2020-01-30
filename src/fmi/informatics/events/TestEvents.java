package fmi.informatics.events;

public class TestEvents {
	
	public static void main(String[] args) {
		Greeting greet = new Greeting();
		User user = new User("Pesho", greet);
		User user1 = new User("Gosho", greet);
		User user2 = new User("Tosho", greet);
		greet.addObserver(user);
		greet.addObserver(user1);
		greet.addObserver(user2);
		greet.setGreet(true);	
		
		//Unit test
		boolean greeting = true;
		if(greeting) {
			System.out.println("\nВсички се поздравиха!");
		}else {
			System.out.println("\nНикой не поздрави никой!");
		}
		greeting = false;
		if(greeting) {
			System.out.println("\nВсички се поздравиха!");
		}else {
			System.out.println("\nНикой не поздрави никой!");
		}	
	}
}