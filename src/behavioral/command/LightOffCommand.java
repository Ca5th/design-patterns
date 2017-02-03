package behavioral.command;

public class LightOffCommand implements Command{
	
	//Reference to the receiver
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.switchOff();
	}

}
