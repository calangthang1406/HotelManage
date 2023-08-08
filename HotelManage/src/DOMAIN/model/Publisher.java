package DOMAIN.model;

import java.util.LinkedList;
import java.util.List;

import DOMAIN.model.HotelModel;

public class Publisher {
    private List<Subscriber> subscribers = new LinkedList<Subscriber>();
	public void subscribe(Subscriber s) { subscribers.add(s); }
	public void unsubscribe(Subscriber s) { subscribers.remove(s); }
	public void notifySubscribers() {
		for(Subscriber s: subscribers) s.update();
	}
}
