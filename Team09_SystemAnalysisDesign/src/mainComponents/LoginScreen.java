package mainComponents;

import java.util.Scanner;

import users.UsersCatalog;

public class LoginScreen extends Screen {

	UsersCatalog assignedCatalog;
	
	public LoginScreen(UsersCatalog aCatalog) {
		super("LoginScreen");
		
		this.assignedCatalog = aCatalog;
		this.displayLoginScreen();
	}

	public void displayLoginScreen() {
		super.showMessage("Welcome to Login Screen");
		this.getCredentials();
	}

	public boolean getCredentials() { //
		boolean credentials = false;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Username: ");
		String aUsername = input.nextLine();
		input.nextLine();
		
		System.out.print("Password: ");
		String aPassword = input.nextLine();
		input.nextLine();
		
		assignedCatalog.validateCredentials(aUsername, aPassword);
		
		return credentials;
	}

	public void showError() {

	}

}