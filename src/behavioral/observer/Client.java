package behavioral.observer;

public class Client {
	
	public static void main(String[] args) {
		Subscriber emailSubscriber = new EmailSubscriber();
		Subscriber smsSubscriber = new SMSSubscriber();
		NewsPublisher newsPublisher = new NewsPublisher();
		
		// A�adiendo los observadores al sujeto
		newsPublisher.attach(emailSubscriber);
		newsPublisher.attach(smsSubscriber);
		
		// A�adiendo una nuevo evento al sujeto
		newsPublisher.addNews("breaking news!");
	}

}
