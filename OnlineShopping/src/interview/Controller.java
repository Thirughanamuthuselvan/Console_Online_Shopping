package interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Controller {
	public static Scanner sc =new Scanner(System.in);
	static HashMap<Integer,ArrayList> inv=new HashMap<>();
	static ArrayList<String> data=new ArrayList<>();
	String userName;
	public static void main(String[] args) {
		System.out.println("-------------------------------");
		System.out.println("  Welcome to Online Shoppping");
		System.out.println("-------------------------------");
		Home();
	}
	public static void Home() {
		System.out.println("1.admin");
		System.out.println("2.User");
		try {
			int n=sc.nextInt();
			if(n==1 || n==2) {
				switch(n) {
				case 1:
					Admin();
					break;
				case 2:
					User();
					break;
				}
			}
		}
		catch(Exception e) {
			System.out.println("Invalid Input..!Please Select valid input!");
			System.out.println("-------------------------------");
			Home();
		}
	}
	public static void Admin() {
		//admin login
		CreateAdmin();

	}

	public static void login(String userName, String password) {
		System.out.println("-------------------------------");	
		System.out.println("Welcome to login");
		System.out.println("1.Admin login");
		System.out.println("2.Manager Login");
		int input=sc.nextInt();
		switch(input) {
		case 1:
			System.out.println("Username : ");
			String inputAdminUser=sc.next();
			if(inputAdminUser.equals(userName)) {
				sc.nextLine();
				System.out.println("Password : ");
				String inputAdminPass=sc.nextLine();
				password=getEncryptPass(password);
				inputAdminPass=getEncryptPass(inputAdminPass);
				checkValidAdmin(password,inputAdminPass);
			}
			else {
				Home();
			}
			break;
		case 2:
			System.out.println("Username : ");
			String inputManagerUser=sc.next();
			if(inputManagerUser.equals(userName)) {
				sc.nextLine();
				System.out.println("Password : ");
				String inputManagerPass=sc.nextLine();
				password=getEncryptPass(password);
				inputManagerPass=getEncryptPass(inputManagerPass);
				checkValidManager(password,inputManagerPass);
			}
			else {
				Home();
			}
			break;
		}
		System.out.println("Username : ");
		String inputAdminUser=sc.next();
		if(inputAdminUser.equals(userName)) {
			sc.nextLine();
			System.out.println("Password : ");
			String inputAdminPass=sc.nextLine();
			password=getEncryptPass(password);
			inputAdminPass=getEncryptPass(inputAdminPass);
			checkValidAdmin(password,inputAdminPass);
		}
		else {
			Home();
		}
	}

	private static void CreateAdmin() {

		System.out.println("----------------------------");
		System.out.println("1.create admin");
		System.out.println("2.login");
		try {
		int input=sc.nextInt();
		switch(input) {
		case 1:
			Admin adm=new Admin();
			System.out.println("Enter Username: ");
			String userName=sc.next();
			adm.setUserName(userName);
			sc.nextLine();
			System.out.println("Password:");
			String adminPassword=sc.nextLine();
			adm.setAdminPassword(adminPassword);
			login(adm.getUserName(),adm.getAdminPassword());
			break;
		case 2:
			System.out.println("Create Admin");
			Admin();
		}
		}
		catch(Exception e) {
			System.out.println("Invalid input");
			Home();
		}

	}
	public static void checkValidAdmin(String password, String inputAdminPass) {
		if(password.equals(inputAdminPass)) {
			System.out.println("------------------------------------------");
			System.out.println("Admin Successfullly logged in...");
			System.out.println("Choose Any Option");
			System.out.println("1.ChangePassword\n2.Update Profile\n3.Create Manager\n4.Update Manager\n5.Remove Manager\n6.Add Inventory\n7.Update Inventory\n8.Remove Inventory\n9.View Inventory\n10.logout");
			int adminOpt=sc.nextInt();
			switch(adminOpt) {
			case 1:
				ChangePassword();
				break;
			case 2:
				UpdateProfile();
				break;
			case 3:
				CreateManager();
				break;
			case 4:
				UpdateManager();
				break;
			case 5:
				RemoveManager();
				break;
			case 6:
				AddInventory();
				break;
			case 7:
				UpdateInventory();
				break;
			case 8:
				RemoveInventory();
				break;
			case 9:
				ViewInventory();
				break;
			case 10:
				logout();
				break;
			}
		}
		else {
			System.out.println("Invalid Admin passsword..Enter Correct Password");
			Home();
		}
	}
	public static void checkValidManager(String password, String inputAdminPass) {
		if(password.equals(inputAdminPass)) {
			System.out.println("------------------------------------------");
			System.out.println("Manager Successfullly logged in...");
			System.out.println("Choose Any Option");
			System.out.println("1.ChangePassword\n2.Update Profile\n3.Add Inventory\n4.Update Inventory\n5.Remove Inventory\n6.View Inventory\n7.logout");
			int adminOpt=sc.nextInt();
			switch(adminOpt) {
			case 1:
				ChangePassword();
				break;
			case 2:
				UpdateProfile();
				break;
			case 3:
				AddInventory();
				break;
			case 4:
				UpdateInventory();
				break;
			case 5:
				RemoveInventory();
				break;
			case 6:
				ViewInventory();
				break;
			case 7:
				logout();
				break;
			}
		}
		else {
			System.out.println("Invalid Admin passsword..Enter Correct Password");
			Home();
		}
	}

	private static void ChangePassword() {
          Admin ad=new Admin();
          String password="admin2023";
          ad.setAdminPassword(password);
          System.out.println("Password Successfully changed..");
          Home();
	}
	public static String getEncryptPass(String inputAdminPass) {
		String encryptPass="";
		for(int i=0;i<inputAdminPass.length();i++) {
			int val=(int)inputAdminPass.charAt(i)+1;
			if(val==122)
				val=97;
			if(val==90)
				val=65;
			if(val==57)
				val=48;
			encryptPass=encryptPass+String.valueOf((char)val);
		}
		return encryptPass;
	}
	public static void User() {
		// user login
		System.out.println("-------------------------------");
	}

	private static void logout() {
		Home();

	}
	private static void ViewInventory() {
		System.out.println(inv);

	}
	private static void RemoveInventory() {
		// TODO Auto-generated method stub

	}
	private static void UpdateInventory() {
		// TODO Auto-generated method stub

	}
	public static void AddInventory() {
		 System.out.println("Enter NoOfItemsToBeAdded :");
	     int noOfItemsTobeAdded=sc.nextInt();
	     for(int i=0;i<noOfItemsTobeAdded;i++) {
	    	 System.out.println("ProductId: ");
	    	 int productId=sc.nextInt();
	    	 System.out.println("invName");
		     String invName=sc.next();
		     System.out.println("Description:");
		     String desc=sc.next();
		     System.out.println("unitPrice:");
		     String unitPrice=sc.next();
		     System.out.println("createdBy:");
		     String createdBy=sc.next();
		     System.out.println("modifiedBy:");
		     String modifiedBy=sc.next();
		     System.out.println("createdTime:");
		     String createdTime=sc.next();
		     System.out.println("modifiedTime:");
		     String modifiedTime=sc.next();
		     System.out.println("stock:");
		     String stock=sc.next();
		     data.add(invName);
		     data.add(desc);
		     data.add(modifiedTime);
		     data.add(createdTime);
		     data.add(modifiedBy);
		     data.add(createdBy);
		     data.add(stock);
		     inv.put(productId, data);
	     }
	     
	}
	public static void RemoveManager() {
		// TODO Auto-generated method stub

	}
	public static void UpdateManager() {
		// TODO Auto-generated method stub

	}
	private static void CreateManager() {
		// TODO Auto-generated method stub

	}
	private static void UpdateProfile() {
		// TODO Auto-generated method stub

	}
}
