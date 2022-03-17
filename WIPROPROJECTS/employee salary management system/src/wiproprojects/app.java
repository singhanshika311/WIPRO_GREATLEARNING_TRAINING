package wiproprojects;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		employeservice es=new employeservice();
		
		int id;
		String name;
		float salary;
		String con="";
		do {
			System.out.println("1:ADD");
			System.out.println("enter your choice");
			int choice=s.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter id");
				id=s.nextInt();
				System.out.println("enter name");
				name=s.next();
				System.out.println("enter salary");
				salary=s.nextFloat();
				employee emp=new employee(id,name,salary);
				break;
			default:
				System.out.println("wrong choice");
				break;
			}
			System.out.println("do you want to continue");
			con=s.next();
		}while(con.equals("y"));

	}

}
