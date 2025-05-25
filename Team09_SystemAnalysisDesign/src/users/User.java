package users;

public class User {

	private String username;
	private String password;
	private String fullName;
	private String role;
	
	public User(String username, String password, String fullName, String role) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.role = role;
	}
}