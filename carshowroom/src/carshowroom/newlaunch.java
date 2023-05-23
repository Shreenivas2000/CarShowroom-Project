package carshowroom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class newlaunch {
	public static void n(){
	String fqcn="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localHost:3306?user=root&password=Shree@2000";
	String inqry="insert into carshowroom.car values(?,?,?,?)";

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter car id :-");
	int id=sc.nextInt();

	System.out.println("Enter car Name :-");
	String nm=sc.next();

	System.out.println("Enter car model :-");
	      String mn=sc.next();
	     
	      System.out.println("Enter car price :-");
	      Double lc=sc.nextDouble();
	     
	     
	      Connection con=null;
	      PreparedStatement pstmt=null;
	      
	      
	      try {
			Class.forName(fqcn);
			
			con=DriverManager.getConnection(url);
			pstmt=con.prepareStatement(inqry);

			pstmt.setInt(1, id);
			pstmt.setString(2, nm);
			pstmt.setString(3, mn);
			pstmt.setDouble(4, lc);

			pstmt.executeUpdate();
			System.out.println("car has been added ....!!!");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      finally {
	    	  if (pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	    	  if (con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	      }
	
	
	}
}
