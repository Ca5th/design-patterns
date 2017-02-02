package behavioral.observer;

public class EmailSubscriber implements Subscriber {
	
	public void update(NewsPublisher publisher) {
		System.out.println("EmailSubscriber getting latest news... ");
		System.out.println(publisher.getLatestNews());
		
	}

}
