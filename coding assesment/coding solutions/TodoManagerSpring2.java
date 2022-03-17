package Module1_GreatLearning;

import java.util.Scanner;

public class TodoManagerSpring2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to add the task list: ");
		int ni = sc.nextInt();
		String[] task = new String[ni];
 		System.out.println("Enter the tasks:");
		for(int i=0;i<ni;i++) {
			task[i] = sc.next();
		}

		System.out.println("Press 1:To update the task.");
		System.out.println("Press 2:To delete the task.");
		System.out.println("Press 3:To search the task.");
		int ch = sc.nextInt();
		if(ch == 1) {
			System.out.print("Enter the position to update: ");
			int position = sc.nextInt();
			System.out.print("Enter the task to include: ");
			String update = sc.next();
			task[position-1] = update;
			
			System.out.println("Updated Task list: ");
			for(int i=0;i<n;i++) {
				System.out.println((i+1)+"."+task[i]);
			}
		}
		
		
		else if(ch == 2) {
			System.out.print("Enter the task to be delete: ");
			String delete = sc.next();
			int j;
			for(j=0;j<n;j++) {
				if(delete.equals(task[j])) {
					task[j] = task[j+1];
				}
			}
			System.out.println("After deletion, the Task list: ");
			for(int i=0;i<n-1;i++) {
				System.out.println(task[i]);
			}		
		}
		
		
		else if(ch == 3) {
			System.out.print("Enter the task to search: ");
			String search = sc.next();
			int found = 0,j;
			for(j=0;j<n;j++) {
				if(search.equals(task[j])) {
					found = 1;
					break;
				}
			}
			if(found == 1) {
				System.out.println(search+" is founded at "+(j+1)+" position");
			}  else {
				System.out.println(search+" is not founded any where");
			}	
		}
	}
}
