package creational.factory.method;

public abstract class Pizza {

	String type;
	
	public void prepare(){
		System.out.println("Preparing " + type + "pizza...");
	}
	
	public void bake(){
		System.out.println("Baking " + type + "pizza...");
	}
	
	public void cut(){
		System.out.println("Cutting " + type + "pizza...");
	}
	
	public void box(){
		System.out.println("Boxing " + type + "pizza...");
	}
	
}
