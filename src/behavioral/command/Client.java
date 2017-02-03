package behavioral.command;

public class Client {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		Light light = new Light();
		
		Command lightsOn = new LightOnCommand(light);
		Command lightsOff = new LightOffCommand(light);
		
		remoteControl.setCommand(lightsOn);
		remoteControl.pressButton();
		
		remoteControl.setCommand(lightsOff);
		remoteControl.pressButton();
	}

}
