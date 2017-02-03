package behavioral.command;

// Receiver
public class Light {
	
	private boolean on;
	
	public void switchOn(){
		on = true;
		System.out.println("lights on");
	}
	
	public void switchOff(){
		on = false;
		System.out.println("lights off");
	}

}
