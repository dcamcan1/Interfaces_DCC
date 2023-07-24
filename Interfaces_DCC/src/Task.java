//Represents a task, such as on a To-Do list

public class Task implements Priority, Comparable<Task> {
	//Enumerated
	enum Status {
		NOT_STARTED,
		IN_PROCESS,
		COMPLETE;
	}//end Status

	//Instance variables
	private final String name;
	private int priority;
	private Status taskStatus;
	
	//Constructor
	public Task(String name) {
		this.name = name;
		this.priority = 5;
		this.taskStatus = Status.NOT_STARTED;
	}//end preferred constructor
	
	//Getters and Setters
	public String getName() {
		return name;
	}//end getName
	
	public Status getStatus() {
		return taskStatus;
	}//end getStatus
	
	public void setStatus(Status taskStatus) {
		this.taskStatus = taskStatus;
	}//end setStatus
	
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority

	public int getPriority() {
		return priority;
	}//end getPriority
	
	//Methods
	@Override
	public int compareTo(Task task2) {
		return this.getPriority() - task2.getPriority();
	}//end compareTo
	
	//toString
	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + ", taskStatus=" + taskStatus + "]";
	}//end toString
	
}//end class