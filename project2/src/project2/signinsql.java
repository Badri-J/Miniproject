package project2;

import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

public class signinsql {
	static Date Date;
	static LocalDate date;
	static String start;
	public static int m = 0;
	public static int no =0;
	static int i=1;
	static Scanner input=new Scanner(System.in);
	static int choice=0;
	static String a;
	static String b;
	public static void person()
	{
   	System.out.print("Enter your name: ");
    String name = input.nextLine();
    System.out.print("Gender: ");
    String gender = input.nextLine();
    System.out.print("Enter your age: ");
    int age = input.nextInt();
    input.nextLine();
	}
	
public static void main(String[] args) throws Exception {
		insertUsingPst();
	}
	public static void insertUsingPst() throws Exception{
		String url = "jdbc:mysql://localhost:3306/project";
		String username = "root";
		String password = "root";
		
		System.out.println("------------------------------------------------");
		System.out.println("             T&T TOURS AND TRAVELS");
		System.out.println("------------------------------------------------");
		System.out.println("Enter your Name: ");
		String name=input.nextLine();
		System.out.println("Enter your Gender: ");
		String gender=input.nextLine();
		System.out.println("Enter your Age: ");
		int age=input.nextInt();
		input.nextLine();
		System.out.println("Enter your Address: ");
		String address=input.nextLine();
		System.out.println("Enter your Phone Number: ");
		String pno=input.nextLine();
		System.out.println("Enter your Email: ");
		String email=input.nextLine();
		a=email;
		
		while(true) {
		System.out.println("------------------------------------------------");
		System.out.println("       WELCOME TO T&T TOURS AND TRAVELS");
		System.out.println("------------------------------------------------");
		System.out.println("Press any number to continue");
		System.out.println("1. To book Flight tour package");
		System.out.println("2. To book Bus tour package");
		System.out.println("3. To book Train tour package");
		System.out.println("4. To book Cruise tour package");
		System.out.println("------------------------------------------------");
		choice=input.nextInt();
		cardpay card = new cardpay();
		switch(choice) {
		case 1:
			flightsql.Fdisplay1();
			int n1=input.nextInt();
			input.nextLine();
			if(n1==1) {
			no=2;
			System.out.println("Enter other person's details:");
	        person();
			flightsql.Fdisplay2();
			m=input.nextInt();
			input.nextLine();
			
			System.out.println("Enter the start date of your journey(DD-MM-YYYY):");
			start=input.nextLine();
			
			System.out.println("The selected package has been booked");
			System.out.println("------------------------------------------------");
			System.out.println("Total bill amount : Rs."+signinsql.no*flightsql.price.get(signinsql.m-1));
			System.out.println("------------------------------------------------");
			System.out.println("Redirecting you to the payment page...");
			card.cardpage();
			flightsql.insertUsingPst();
			}
			else if(n1==2) {
				System.out.println("Enter the number of members:");
				no=input.nextInt();
				input.nextLine();
				for(i=1;i<=no;i++) {
					System.out.println("Person "+i+" details:");
		           	person();
	            }
				flightsql.Fdisplay2();
				
				m=input.nextInt();
				input.nextLine();
				
				System.out.println("Enter the start date of your journey(DD-MM-YYYY):");
				start=input.nextLine();
				System.out.println("The selected package has been booked");
				System.out.println("------------------------------------------------");
				System.out.println("Total bill amount : Rs."+signinsql.no*flightsql.price.get(signinsql.m-1));
				System.out.println("------------------------------------------------");
				System.out.println("Redirecting you to the payment page...");
				card.cardpage();
				flightsql.insertUsingPst();
			}
			break;
		case 2:
			bussql.Bdisplay1();
			int n2=input.nextInt();
			input.nextLine();
			if(n2==1) {
			no=2;
			System.out.println("Enter other person's details:");
	        person();
			bussql.Bdisplay2();
			m=input.nextInt();
			input.nextLine();
			
			System.out.println("Enter the start date of your journey(DD-MM-YYYY):");
			start=input.nextLine();
			
			System.out.println("The selected package has been booked");
			System.out.println("------------------------------------------------");
			System.out.println("Total bill amount : Rs."+signinsql.no*bussql.price.get(signinsql.m-1));
			System.out.println("------------------------------------------------");
			System.out.println("Redirecting you to the payment page...");
			card.cardpage();
			bussql.insertUsingPst();
			}
			else if(n2==2) {
				System.out.println("Enter the number of members:");
				no=input.nextInt();
				input.nextLine();
				for(i=1;i<=no;i++) {
					System.out.println("Person "+i+" details:");
		           	person();
	            }
				bussql.Bdisplay2();
				
				m=input.nextInt();
				input.nextLine();
				
				System.out.println("Enter the start date of your journey(DD-MM-YYYY):");
				start=input.nextLine();
				System.out.println("The selected package has been booked");
				System.out.println("------------------------------------------------");
				System.out.println("Total bill amount : Rs."+signinsql.no*bussql.price.get(signinsql.m-1));
				System.out.println("------------------------------------------------");
				System.out.println("Redirecting you to the payment page...");
				card.cardpage();
				bussql.insertUsingPst();
			}
			break;
		case 3:
			railsql.Rdisplay1();
			int n3=input.nextInt();
			input.nextLine();
			if(n3==1) {
			no=2;
			System.out.println("Enter other person's details:");
	        person();
			railsql.Rdisplay2();
			m=input.nextInt();
			input.nextLine();
			
			System.out.println("Enter the start date of your journey(DD-MM-YYYY):");
			start=input.nextLine();
			
			System.out.println("The selected package has been booked");
			System.out.println("------------------------------------------------");
			System.out.println("Total bill amount : Rs."+signinsql.no*railsql.price.get(signinsql.m-1));
			System.out.println("------------------------------------------------");
			System.out.println("Redirecting you to the payment page...");
			card.cardpage();
			railsql.insertUsingPst();
			}
			else if(n3==2) {
				System.out.println("Enter the number of members:");
				no=input.nextInt();
				input.nextLine();
				for(i=1;i<=no;i++) {
					System.out.println("Person "+i+" details:");
		           	person();
	            }
				railsql.Rdisplay2();
				
				m=input.nextInt();
				input.nextLine();
				
				System.out.println("Enter the start date of your journey(DD-MM-YYYY):");
				start=input.nextLine();
				System.out.println("The selected package has been booked");
				System.out.println("------------------------------------------------");
				System.out.println("Total bill amount : Rs."+signinsql.no*railsql.price.get(signinsql.m-1));
				System.out.println("------------------------------------------------");
				System.out.println("Redirecting you to the payment page...");
				card.cardpage();
				railsql.insertUsingPst();
			}
			break;
		case 4:
			shipsql.Sdisplay1();
			int n4=input.nextInt();
			input.nextLine();
			if(n4==1) {
			no=2;
			System.out.println("Enter other person's details:");
	        person();
			shipsql.Sdisplay2();
			m=input.nextInt();
			input.nextLine();
			
			System.out.println("Enter the start date of your journey(DD-MM-YYYY):");
			start=input.nextLine();
			
			System.out.println("The selected package has been booked");
			System.out.println("------------------------------------------------");
			System.out.println("Total bill amount : Rs."+signinsql.no*shipsql.price.get(signinsql.m-1));
			System.out.println("------------------------------------------------");
			System.out.println("Redirecting you to the payment page...");
			card.cardpage();
			shipsql.insertUsingPst();
			}
			else if(n4==2) {
				System.out.println("Enter the number of members:");
				no=input.nextInt();
				input.nextLine();
				for(i=1;i<=no;i++) {
					System.out.println("Person "+i+" details:");
		           	person();
	            }
				shipsql.Sdisplay2();
				
				m=input.nextInt();
				input.nextLine();
				
				System.out.println("Enter the start date of your journey(DD-MM-YYYY):");
				start=input.nextLine();
				System.out.println("The selected package has been booked");
				System.out.println("------------------------------------------------");
				System.out.println("Total bill amount : Rs."+signinsql.no*shipsql.price.get(signinsql.m-1));
				System.out.println("------------------------------------------------");
				System.out.println("Redirecting you to the payment page...");
				card.cardpage();
				shipsql.insertUsingPst();
			}
			break;
		}
		String packagetype = null;
		if(choice==1) {
			packagetype="Flight";
//			b=packagetype;
		}
		if(choice==2) {
			packagetype="Bus";
//			b=packagetype;
		}
		if(choice==3) {
			packagetype="Train";
//			b=packagetype;
		}
		if(choice==4) {
			packagetype="Cruise";
//			b=packagetype;
		}
//		b=packagetype;
		String payment = "Incomplete";
		if(card.paymentSuccess) {
			payment = "Success";
		}
		String query="insert into signin(NAME,GENDER,AGE,ADDRESS,PHONE_NO,EMAIL,PACKAGE,PAYMENT_STATUS) values(?,?,?,?,?,?,?,?);";
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, name);
		pst.setString(2, gender);
		pst.setInt(3, age);
		pst.setString(4, address);
		pst.setString(5, pno);
		pst.setString(6, email);
		pst.setString(7, packagetype);
		pst.setString(8, payment);
		int rows=pst.executeUpdate();
		con.close();
	}
}
}
