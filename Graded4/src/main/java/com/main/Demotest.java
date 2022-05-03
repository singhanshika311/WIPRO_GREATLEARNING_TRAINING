package com.main;


import java.util.Scanner;
import com.bean.Book;
import com.service.Bookservice;

public class Demotest {
	public static void main(String[] args) {
		Bookservice bs = new Bookservice();
		
		Scanner scan = new Scanner(System.in);
		int choice;
		String con;
		do {
			System.out.println("1:Add Books\n"+"2.Delete Books\n"+
								"3.UpdateBooks\n"+"4.Display all the Books\n"+
								"5.Total count Of Books\n"+"6.Books under Autobiography genre\n"+"7.Arrange in Order\n"+
								"Enter your Choice");
			 choice = Integer.parseInt(scan.nextLine());
			switch(choice) {
			case 1:
				Book b = bs.insertBook();
				System.out.println(bs.storeBook(b));
				break;
			case 2:
				System.out.println(bs.deleteBook());
				break;
			case 3:
				System.out.println(bs.UpdateBook());
				break;
			case 4:
				System.out.println(bs.Displayall());
				break;
			case 5:
				System.out.println(bs.CountBooks());
				break;
			case 6:
				bs.DisplayallbyType();
				break;
			case 7:
				bs.Arrange();
				break;
				
			default:
				break;

			
				
			}
			System.out.println("do you want to Continue ?(y/n)");
			con=scan.nextLine();
		}while(con.equals("y"));
		
	}

}
