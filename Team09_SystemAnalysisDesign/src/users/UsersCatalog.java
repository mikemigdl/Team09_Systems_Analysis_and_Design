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

	public User validateCredentials(String username, String password) {
		User userFound = null;
		
		for(int i=0; i<usersList.size(); i++) {
			if(usersList.get(i).getUsername().equals(username)) { //username validated
				if(usersList.get(i).getPassword().equals(password)){ //password validated
					userFound = usersList.get(i);
					break;
				} else { //username validated, password not validated
					userFound = new User(username, "wrong password", "", ""); //dummy user
					break;
				}
			}
		}
		
		return userFound;
	}

}