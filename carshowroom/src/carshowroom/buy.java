package carshowroom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class buy {
	public static void buy() {
		 String fqcn="com.mysql.cj.jdbc.Driver";
		  String url = "jdbc:mysql://localHost:3306?user=root&password=Shree@2000";
		  
		  Connection con=null;
		  PreparedStatement pstmt=null;
		  ResultSet rs=null;

		  try {
			Class.forName(fqcn);
			con= DriverManager.getConnection(url);
			pstmt=con.prepareStatement("select * from carshowroom.car ");
			
			rs=pstmt.executeQuery();
			System.out.println("---------// DETAILS OF CAR'S //--------");
			while(rs.next())
			{
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String model=rs.getString("model");
			String price=rs.getString("price");

			// System.out.println("---------// DETAILS OF CAR'S //--------");
			System.out.println("                   ");
			System.out.println("-----------------------------------------------------------");
			System.out.println("                   ");
			System.out.println("car_id is : "  +id );
			System.out.println("car_name is : "  +name);
			System.out.println( "car_model is : " +model);
			System.out.println("car_price : " +price);
			System.out.println("                   ");

			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  finally {
			  if(rs!=null) {
				  try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
			  if(pstmt!=null) {
				  try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
			  if(con!=null) {
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
