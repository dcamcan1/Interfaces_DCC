//Defines a way to establish numeric priority among a set of objects

public interface Priority {
	
	//Constants
	public final static int MED_PRIORITY = 5;
	public final static int MIN_PRIORITY = 1;
	public final static int MAX_PRIORITY = 10;
	
	//Methods
	public void setPriority(int priority);
	public int getPriority();
	
}//end interface
