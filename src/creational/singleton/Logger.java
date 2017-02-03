package creational.singleton;

public class Logger {
	
	private static Logger instance;
	
	// El constructor es privado para evitar que la clase sea instanciada externamente
	private Logger(){
		
	}
	
	public static Logger getInstance(){
		if(instance == null){
			instance = new Logger();
		} 
		
		return instance;
	}
	
	public void Log(String message){
		//logging code
	}

}
