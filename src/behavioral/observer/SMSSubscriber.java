package behavioral.observer;

public class SMSSubscriber implements Subscriber {

	public void update(NewsPublisher publisher) {
		System.out.println("SMSSubscriber getting latest news... ");
		System.out.println(publisher.getLatestNews());
		
	}

}
