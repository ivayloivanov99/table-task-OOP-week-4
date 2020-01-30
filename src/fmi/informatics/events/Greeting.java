package fmi.informatics.events;

import java.util.ArrayList;
import java.util.List;

public class Greeting implements Observable {
	
	private List<Observer> people = new ArrayList<>();
	private boolean greeted;

	@Override
	public void addObserver(Observer o) {
		people.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		people.remove(o);
	}

	@Override
	public void notifyObserver() {
		for(Observer person : people) {
			person.update();
		}
	}

	public boolean isGreeted() {
		return greeted;
	}

	public void setGreet(boolean greeted) {
		this.greeted = greeted;
		if (greeted) notifyObserver();
	}
}