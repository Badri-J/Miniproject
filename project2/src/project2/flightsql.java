package project2;

import java.sql.*;
import java.util.*;

public class flightsql {
	static ArrayList<String> des= new ArrayList<String>() {
		{
			add("Rome,Italy");
			add("Barcelona,Spain");
			add("Paris,France");
			add("Cherrapunjee-Guwahati-Kaziranga-Mawlynnong-Shillong");
			add("Gulmarg-Pahalgam-Sonmarg-Srinagar");
			add("Ladakh-Leh-Pangong");
		}
	};
	static ArrayList<Integer> days= new ArrayList<Integer>() {
		{
			add(7);
			add(6);
			add(10);
			add(7);
			add(6);
			add(7);
		}
	};
	static ArrayList<Integer> price= new ArrayList<Integer>() {
		{
			add(100000);
			add(95000);
			add(120000);
			add(44500);
			add(48100);
			add(53600);
		}
	};
	static void Fdisplay1() {
		System.out.println("FLIGHT TOUR PACKAGES");
		System.out.println("");
		System.out.println("Press 1 to check 'Couple Tour Packages'");
		System.out.println("Press 2 to check 'Family Tour Packages'");
		System.out.println("Choose your option: ");
	}
	static void Fdisplay2() {
		System.out.println("1. Chennai to Rome,Italy ->7 days@Rs.100000");
		System.out.println("2. Chennai to Barcelona,Spain ->6 days@Rs.95000");
		System.out.println("3. Chennai to Paris,France ->10 days@Rs.120000");
		System.out.println("4. Chennai to Cherrapunjee-Guwahati-Kaziranga-Mawlynnong-Shillong ->7 days@Rs.44500");
		System.out.println("5. Chennai to Gulmarg-Pahalgam-Sonmarg-Srinagar ->6 days@Rs.48100");
		System.out.println("6. Chennai to Ladakh-Leh-Pangong ->7 days@Rs.53600");
	}
public static void insertUsingPst() throws Exception{
	String url = "jdbc:mysql://localhost:3306/project";
	String username = "root";
	String password = "root";
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the ID: ");
	int id=input.nextInt();
	input.nextLine();
	
	String query="insert into flightpackage(ID,SOURCE,DESTINATION,MEMBERS,DAYS,START_DATE,PRICE) values(?,?,?,?,?,?,?);";
	
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
