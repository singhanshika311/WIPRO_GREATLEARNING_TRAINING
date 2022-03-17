package module1.java;
import java.util.Scanner;
public class module1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("What is your name?");
		String name = in.nextLine();
		System.out.println("Hello"+name);
		System.out.println("=======================================\n");
		String task1, task2 ,task3, task4, task5;
		System.out.println("Enter your tasks for today:");
		task1= in.nextLine();
		task2= in.nextLine();
		task3= in.nextLine();
		task4= in.nextLine();
		task5= in.nextLine();
		System.out.println("=======================================\n");
		System.out.println("Press A to list tasks in asscending order or D to list tasks in descending order");
		char choicee= in.next().charAt(0);
		System.out.println("=======================================\n");
		if(choicee=='A')
		{
			System.out.println(task1);
			System.out.println(task2);
			System.out.println(task3);
			System.out.println(task4);
			System.out.println(task5);
		}
		else if(choicee=='D')
		{
			System.out.println(task5);
			System.out.println(task4);
			System.out.println(task3);
			System.out.println(task2);
			System.out.println(task1);
		}
		else
		{
			System.out.println("Invalide input");
		}
		System.out.println("=======================================\n");
		if(task1.equals(task2)||task1.equals(task3)||task1.equals(task4)||task1.equals(task5))
		{
			System.out.println("You have a repeated task");
		}
		else if(task2.equals(task1)||task2.equals(task3)||task2.equals(task4)||task2.equals(task5))
		{
			System.out.println("You have a repeated task");
		}
		else if(task3.equals(task1)||task3.equals(task2)||task3.equals(task4)||task3.equals(task5))
		{
			System.out.println("You have a repeated task");
		}
		else if(task4.equals(task1)||task4.equals(task2)||task4.equals(task3)||task4.equals(task5))
		{
			System.out.println("You have a repeated task");
		}
		else if(task5.equals(task1)||task5.equals(task2)||task5.equals(task3)||task5.equals(task4))
		{
			System.out.println("You have a repeated task");
		}
		else
		{
			System.out.println("You have no repeated task");
		}
		System.out.println("=======================================\n");
		in.close();
	}

}