package project2;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class startenddate {
	private static Date Date = null;
	static Scanner input=new Scanner(System.in);
	private Date sqlDatePlusDays(Date date, int days) {
	    return Date.valueOf(date.toLocalDate().plusDays(days));
	}
	public static void main(String[] args) throws Exception {
		insertUsingPst();
		//readrecords();
	}
	public static void insertUsingPst() throws Exception{
		String url = "jdbc:mysql://localhost:3306/project";
		String username = "root";
		String password = "root";
		
		System.out.println("Select the Start Date of your journey: ");
		//java.sql.Date start = null;
		String start = input.next(); 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDate date = LocalDate.parse(start, formatter); 
		String query="insert into dates values(?,?);";
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, start);
		pst.setDate(2, Date.valueOf(date.plusDays(5)));
				
		int rows=pst.executeUpdate();

	}
}
