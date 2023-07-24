//Represents process that might run on a computer (i.e. Task Manager)

public class Process implements Priority, Comparable<Process> {

	//Instance Variables
	private final String processID;
	private int priority;

	//Constructor
	public Process(String processID) {
		this.processID = processID;
		this.priority = 5;
	}//end preferred constructor
	
	//Methods
	@Override
	public int compareTo(Process process2) {
		return this.getPriority() - process2.getPriority();
	}//end compareTo
	
	//Getters and Setters
	public int getPriority() {
		return priority;
	}//end getPriority
	
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority
	
	public String getProcessID() {
		return processID;
	}//end getProcessID

	//toString
	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}//end toString
	
}//end Priority
