package project2;

import java.sql.*;
import java.util.*;

public class railsql {
	
	static ArrayList<String> des= new ArrayList<String>() {
		{
			add("Bhubaneswar-Chilika Lake-Konark-Puri");
			add("Ooty-Mudumalai");
			add("Badrinath-Gangotri-Kedarnath-Yamunotri");
			add("Kodaikanal");
			add("Kanyakumari-Rameshwaram");
		}
	};
	static ArrayList<Integer> days= new ArrayList<Integer>() {
		{
			add(5);
			add(5);
			add(13);
			add(5);
			add(5);
		}
	};
	static ArrayList<Integer> price= new ArrayList<Integer>() {
		{
			add(12000);
			add(7900);
			add(15000);
			add(9420);
			add(9500);
		}
	};
	static void Rdisplay1() {
		System.out.println("TRAIN TOUR PACKAGES");
		System.out.println("");
		System.out.println("Press 1 to check 'Couple Tour Packages'");
		System.out.println("Press 2 to check 'Family Tour Packages'");
		System.out.println("Choose your option: ");
	}
	static void Rdisplay2() {
		System.out.println("1. Chennai to Bhubaneswar-Chilika Lake-Konark-Puri ->5 days@Rs.12000");
		System.out.println("2. Chennai to Ooty-Mudumalai ->5 days@Rs.7900");
		System.out.println("3. Chennai to Badrinath-Gangotri-Kedarnath-Yamunotri ->13 days@Rs.15000");
		System.out.println("4. Chennai to Kodaikanal ->5 days@Rs.9420");
		System.out.println("5. Chennai to Kanyakumari-Rameshwaram ->5 days@Rs.9500");
	}
	public static void insertUsingPst() throws Exception{
		String url = "jdbc:mysql://localhost:3306/project";
		String username = "root";
		String password = "root";
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the ID: ");
		int id=input.nextInt();
		input.nextLine();
		
		String query="insert into railpackage(ID,SOURCE,DESTINATION,MEMBERS,DAYS,START_DATE,PRICE) values(?,?,?,?,?,?,?);";
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, id);
		pst.setString(2, "Chennai");
		pst.setString(3, des.get(signinsql.m-1));
		pst.setInt(4, signinsql.no);
		pst.setInt(5, days.get(signinsql.m-1));
		pst.setString(6, signinsql.start);
		pst.setInt(7, signinsql.no*price.get(signinsql.m-1));
		
		int rows=pst.executeUpdate();
		
		System.out.println("Number of rows updated: "+rows);
		con.close();
	}
}
