package fmi.informatics.events;

public class User implements Observer {
	
	private String name;
	private Observable observable;
	
	public User(String name, Observable observable) {
		this.name = name;
		this.observable = observable;
	}
	
	public void unsubscribe() {
		observable.removeObserver(this);
	}
	
	public void greet() {
		System.out.println("The user " + name + " said hello!");
	}

	@Override
	public void update() {
		greet();
	
	}
}