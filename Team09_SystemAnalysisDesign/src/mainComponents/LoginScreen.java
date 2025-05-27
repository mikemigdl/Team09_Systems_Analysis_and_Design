package mainComponents;

import java.util.Scanner;

import users.User;
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

	public boolean getCredentials() {
		boolean credentials = false;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Username: ");
		String aUsername = input.nextLine();
		
		System.out.print("Password: ");
		String aPassword = input.nextLine();
		
		User userFound = assignedCatalog.validateCredentials(aUsername, aPassword);
		
		if(userFound != null) {
			if(userFound.getPassword().equals("wrong password")) {
				this.incorrectPasswordMessage(); //user found, password not validated
			} else {
				//user found, password validated
			}
			this.userNotFoundMessage(aUsername); //user not found
		}
		
		return credentials;
	}
	
	public void incorrectPasswordMessage() {
		
	}
	
	public void userNotFoundMessage(String aUsername) {
		super.showMessage("User: " + aUsername + " has not been found.");
	}

	public void showError() {

	}

}