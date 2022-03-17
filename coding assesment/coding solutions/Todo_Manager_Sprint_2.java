import java.util.*;
public class Todo_Manager_Sprint_2 {

	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to add the task list: ");
		int n = sc.nextInt();
		String[] task = new String[n];
 		System.out.println("Enter the tasks:");
		for(int i=0;i<n;i++) {
			task[i] = sc.next();
		}

		System.out.println("Press 1:To update the task.");
		System.out.println("Press 2:To delete the task.");
		System.out.println("Press 3:To search the task.");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			System.out.print("Enter the position to update: ");
			int pos = sc.nextInt();
			System.out.print("Enter the task to include: ");
			String update = sc.next();
			task[pos-1] = update;
			
			System.out.println("Updated Task list: ");
			for(int i=0;i<n;i++) {
				System.out.println((i+1)+"."+task[i]);
			}
		}
		
		
		else if(choice == 2) {
			System.out.print("Enter the task to delete: ");
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
		
		
		else if(choice == 3) {
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
