//Tests both Task and Process objects
public class ApplicationProgram2 {

	public static void main(String[] args) {
		
		//================================================
		//TASK TESTER
		System.out.println("TASK TESTING:");
		//Constructor & toString tests (no empty-argument due to needing name)
		Task task1 = new Task("Task #1");
		System.out.println("Constructor & toString tests: "+task1.toString());
		//Getters & setters tests
		System.out.println("getName test: "+task1.getName());
		Task.Status complete = Task.Status.COMPLETE;
		Task.Status in_process = Task.Status.IN_PROCESS;
		Task.Status not_started = Task.Status.NOT_STARTED;
		task1.setStatus(complete);
		System.out.println("setStatus & getStatus test: "+task1.getStatus());
		task1.setPriority(1);
		System.out.println("setPriority & getPriority test: "+task1.getPriority());
		//compareTo test
		System.out.print("compareTo test: ");
		Task task2 = new Task("Task #2");
		task2.setPriority(10);
		task2.setStatus(in_process);
		if (task1.compareTo(task2) < 0) {
			System.out.println("task1 has a lower priority than task2.");
		}//end if (lower)
		else if (task1.compareTo(task2) > 0) {
			System.out.println("task1 has a higher priority than task2.");
		}//end else if (higher)
		else {
			System.out.println("task1 and task2 have equal priority.");
		}//end else (equal)

		
		//================================================
		//PROCESS TESTER
		System.out.println("\nPROCESS TESTING:");
		//Constructor & toString tests (no empty-argument due to needing name)
		Process process1 = new Process("#281742");
		System.out.println("Constructor & toString tests: "+process1.toString());
		//Getters & setters tests
		System.out.println("getProcessID test: "+process1.getProcessID());
		process1.setPriority(10);
		System.out.println("setPriority & getPriority test: "+task1.getPriority());
		//compareTo test
		System.out.print("compareTo test: ");
		Process process2 = new Process("#5465234");
		process2.setPriority(1);
		if (process1.compareTo(process2) < 0) {
			System.out.println("process1 has a lower priority than process2.");
		}//end if (lower)
		else if (process1.compareTo(process2) > 0) {
			System.out.println("process1 has a higher priority than process2.");
		}//end else if (higher)
		else {
			System.out.println("process1 and process2 have equal priority.");
		}//end else (equal)
	}//end main
}//end class
