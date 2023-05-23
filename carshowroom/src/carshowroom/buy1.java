package carshowroom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class buy1 {
	public static void buy1() {
		System.out.println(" ------> PLEASE SELECT CAR ID FOR BUY <------ ");
		System.out.println("                                                ");
		
		String fqcn="com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localHost:3306?user=root&password=Shree@2000";
		String deqry="delete from carshowroom.car where id=?";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter car id :-");
		int id=sc.nextInt();
		     
		

		  
		  Connection con=null;
		  PreparedStatement pstmt=null;
		  
		  try {
			Class.forName(fqcn);
			con=DriverManager.getConnection(url);
			pstmt=con.prepareStatement(deqry);
			
			pstmt.setInt(1, id);


			pstmt.executeUpdate();
			System.out.println("car buying process successfully...!!!!");

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("=================plz enter valid data=================");
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
			  
			  public static void M()
		      {
		      try
		      {
		      Scanner sc=new Scanner(System.in);
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
		      catch(Exception a)
		      {
		      System.out.println("*********  PLEASE PRESS 1 FOR : BACK TO MAIN PAGE   **********");
		    M();
		  }
		  
		  
	}
}
