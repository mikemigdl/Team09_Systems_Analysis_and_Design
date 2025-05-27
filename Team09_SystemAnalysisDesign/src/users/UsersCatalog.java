package users;

import java.util.ArrayList;

public class UsersCatalog {

	private ArrayList<User> usersList;
	
	public UsersCatalog() {
		super();
		usersList = new ArrayList<>();
	}
	
	public void addUser(User aUser) {
		this.usersList.add(aUser);
	}

	public User findUser(String username) {
		User aUser = null;
		
		return aUser;
	}

	public void validateCredentials(String username, String password) {

	}

}