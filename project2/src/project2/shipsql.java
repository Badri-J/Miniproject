package project2;

import java.sql.*;
import java.util.*;

public class shipsql {

	static ArrayList<String> des= new ArrayList<String>() {
		{
			add("Sri Lanka");
			add("Dubai(One-way Trip)");
			add("Mumbai via Kochi-Colombo-Trincomalee(One-way Trip)");
		}
	};
	static ArrayList<Integer> days= new ArrayList<Integer>() {
		{
			add(5);
			add(12);
			add(7);
		}
	};
	static ArrayList<Integer> price= new ArrayList<Integer>() {
		{
			add(39541);
			add(134004);
			add(91508);
		}
	};
	static void Sdisplay1() {
		System.out.println("CRUISE TOUR PACKAGES");
		System.out.println("");
		System.out.println("Press 1 to check 'Couple Tour Packages'");
		System.out.println("Press 2 to check 'Family Tour Packages'");
		System.out.println("Choose your option: ");
	}
	static void Sdisplay2() {
		System.out.println("1. Chennai to Sri Lanka ->5 days@Rs.39541");
		System.out.println("2. Chennai to Dubai(One-way Trip) ->12 days@Rs.134004");
		System.out.println("3. Chennai to Mumbai via Kochi-Colombo-Trincomalee(One-way Trip) ->7 days@Rs.91508");
	}
	public static void insertUsingPst() throws Exception{
		String url = "jdbc:mysql://localhost:3306/project";
		String username = "root";
		String password = "root";
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the ID: ");
		int id=input.nextInt();
		input.nextLine();
		
		String query="insert into shippackage(ID,SOURCE,DESTINATION,MEMBERS,DAYS,START_DATE,PRICE) values(?,?,?,?,?,?,?);";
		
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
