package project2;

import java.sql.*;
import java.util.*;

public class bussql {
	
	static ArrayList<String> des= new ArrayList<String>() {
		{
			add("Tirumala,Tirupati");
			add("Pondicherry");
			add("Rameshwaram");
		}
	};
	static ArrayList<Integer> days= new ArrayList<Integer>() {
		{
			add(1);
			add(2);
			add(4);
		}
	};
	static ArrayList<Integer> price= new ArrayList<Integer>() {
		{
			add(2000);
			add(5000);
			add(10000);
		}
	};
	static void Bdisplay1() {
		System.out.println("BUS TOUR PACKAGES");
		System.out.println("");
		System.out.println("Press 1 to check 'Couple Tour Packages'");
		System.out.println("Press 2 to check 'Family Tour Packages'");
		System.out.println("Choose your option: ");
	}
	static void Bdisplay2() {
		System.out.println("1. Chennai to Tirumala,Tirupati ->1 days@Rs.2000");
		System.out.println("2. Chennai to Pondicherry ->2 days@Rs.5000");
		System.out.println("3. Chennai to Rameshwaram ->4 days@Rs.10000");
	}
	public static void insertUsingPst() throws Exception{
		String url = "jdbc:mysql://localhost:3306/project";
		String username = "root";
		String password = "root";
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the ID: ");
		int id=input.nextInt();
		input.nextLine();
		
		String query="insert into buspackage(ID,SOURCE,DESTINATION,MEMBERS,DAYS,START_DATE,PRICE) values(?,?,?,?,?,?,?);";
		
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

