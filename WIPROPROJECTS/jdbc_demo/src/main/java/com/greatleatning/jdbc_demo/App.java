package com.greatleatning.jdbc_demo;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		bookDao books=new bookDao();
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/anshidb", "root", "anshika@123");
			Statement stmt=conn.createStatement();
			int input;
			do {
				System.out.println("book dao");
				System.out.println("1:display");
				System.out.println("2:insert");
				System.out.println("3:modify");
				System.out.println("4:delete");
				Scanner sc=new Scanner(System.in);
				System.out.println("enter value");
				input=sc.nextInt();
				switch (input) {
				case 1:
					books.getBooks(stmt);
					
				
					
					break;
				

				default:
					break;
				}
			}while(input>0);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
