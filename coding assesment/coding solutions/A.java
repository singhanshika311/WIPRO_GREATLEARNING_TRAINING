import java.util.ArrayList;
import java.util.Scanner;

class Employee{
	String name;
	String task[];

	Employee(String name,String[] task){
		this.name = name;
		this.task = task;
	}
	
	void incresing(){
		int len = task.length;
		String tmp;
		for (int i=0;i<len;i++){
			for (int j=i+1;j<len;j++){
				if (task[i].compareTo(task[j])>0){
					tmp = task[i];
					task[i] = task[j];
					task[j] = tmp;
				}
			}
		}
		System.out.println("List of tasks in incresing order are:");
		for (int i=0;i<len;i++){
			System.out.println(task[i]);
		}
	}


	void decresing(){
		int len = task.length;
		for (int i=0;i<len;i++){
			for (int j=i+1;j<len;j++){
				if (task[i].compareTo(task[j])<0){
					String tmp = task[i];
					task[i] = task[j];
					task[j] = tmp;
				}
			}
		}

		System.out.println("List of tasks in decresing order are:");
		for (int i=0;i<len;i++){
			System.out.println(task[i]);
		}
	}
	
	void printTask(){
		int len = task.length;
		System.out.println("List of Tasks are:");
		for (int i=0;i<len;i++){
			System.out.println(task[i]);
		}
	}
	
	void printName(){
		System.out.println("Name: "+ name);
	}

	void printRepeat(){
		int len = task.length;
		for (int i=0;i<len;i++){
			for (int j=i+1;j<len;j++){
				if (task[i].compareTo(task[j])==0){
					System.out.println(task[i]);	
				}
			}
		}

	}
}

class Anshi{ 
	public static void main(String[] args){
	String[] arr = {"reading","writing","listening","reading","speaking"};                                            
	Employee e = new Employee("Amit",arr);

	Scanner sc = new Scanner(System.in);
	System.out.println("Press 1 to print your name");
	System.out.println("Press 2 to print task sequence");
	System.out.println("Press 3 to print task in incresing order");
	System.out.println("Press 4 to print task in decresing order");
	System.out.println("Press 5 to print repeated task");
	System.out.println("=================================");
	
	
	while(true){
		System.out.print("Enter your choice:");
		int inp = sc.nextInt();
		switch(inp){
		
			case 1:
				e.printName();
				break;

			case 2:
				e.printTask();
				break;
			
			case 3:
				e.incresing();
				break;
			
			case 4:
				e.decresing();
				break;

			case 5:
				e.printRepeat();
				break;
			case 6:
				System.out.println("Exiting the System...");
				System.exit(1);
				break;
			}
		}
	}
}