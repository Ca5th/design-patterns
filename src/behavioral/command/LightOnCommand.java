package behavioral.command;

// Concrete command
public class LightOnCommand implements Command {
	
	// The command keeps a reference to the receiver
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.switchOn();		
	}

}
