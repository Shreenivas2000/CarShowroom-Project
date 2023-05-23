package carshowroom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class regestration {
	
	public static void reg() {
		String fqcn = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localHost:3306?user=root&password=Shree@2000";
		String inqry="insert into carshowroom.regestration values(?,?,?)";

		Scanner sc=new Scanner(System.in);


		System.out.println("Enter your Name :-");
		String nm=sc.next();

		System.out.println("Enter your Mobile no. :-");
		      int mn=sc.nextInt();
		     
		      System.out.println("Enter your location :-");
		      String lc=sc.next();
		     
		     
		      Connection con=null;
		      PreparedStatement pstmt=null;
		      
		      try {
				Class.forName(fqcn);
				con=DriverManager.getConnection(url);
				pstmt=con.prepareStatement(inqry);
				
				pstmt.setString(1, nm);
				pstmt.setInt(2, mn);
				pstmt.setString(3, lc);
				
				pstmt.executeUpdate();
				
				System.out.println("========Regestration is Successfull......==========");
				
				
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
				      System.out.println("--------------------------------");
				      System.out.println("                      ");
				      System.out.println("Enter 1 for : Back to main page");
				      int n=sc.nextInt();
				      switch(n)
				      {
				      case 1:welcome.welcome();
				      break;
				      default:System.out.println("data not found");
				      break;
				     
				      }

				}
				
	
		  
	}

