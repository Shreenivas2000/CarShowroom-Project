package carshowroom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class welcome {
	
	
	//welcome method
static void welcome() {
	System.out.println();
	System.out.println("==============Welcome to SHOWROOM==============");
	System.out.println();
	
	System.out.println("press 1 : for Regestration");
	System.out.println("press 2 : sell");
	System.out.println("press 3 : to bye carr");
	System.out.println("press 4 : upcomming car");
	
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	
	switch(n) {
	case 1: 
		System.out.println("=========plz do regestration============");
		regestration.reg();
		
		break;
	case 2:
		System.out.println("+======= plz fill ur car details==============");
		sell.sell();
		
		break;
	case 3 :
		System.out.println("===================plz select car id to buy===================");
		buy.buy();
		buy1.buy1();
		buy1.M();
		
		break;
	case 4:
		System.out.println("========================plz fill the details of newly launch car========================");
		newlaunch.n();
		buy1.M();
		
		break;
	case 5:
		welcome();
		
	}
	
	
	
	
	}
public static void main(String[] args) {
	welcome();
}
}
