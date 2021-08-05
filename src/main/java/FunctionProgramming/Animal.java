package FunctionProgramming;

public interface Animal {
	public abstract void eating();
	public abstract void waliking();
	
	default void running() {
		System.out.println("I am running");
	}
	
    default void learning() {
    	System.out.println("I am learning");
	}
	
	
	
	

}
