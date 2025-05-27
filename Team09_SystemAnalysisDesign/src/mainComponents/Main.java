package mainComponents;

import users.User;
import users.UsersCatalog;

public class Main {

	public static void main(String[] args) {

		User user1 = new User("takis", "mouAresounTaKerasia", "Anastasios Anastasidis", "Owner");
		User user2 = new User("mitsaras", "asdasdasd", "Dimitris Dimitrakis", "Director");
		User user3 = new User("panos", "abcdefg", "Panagiotis Panagiotidis", "Purchase Director");
		User user4 = new User("alexalex", "adbhkvbhkj", "Alexandros Alexandrakis", "Sales Director");
		User user5 = new User("petranestis", "enaduotria", "Petros Anestis", "Warehouse Worker");
		
		UsersCatalog usersCatalog1 = new UsersCatalog();
		usersCatalog1.addUser(user1);
		usersCatalog1.addUser(user2);
		usersCatalog1.addUser(user3);
		usersCatalog1.addUser(user4);
		usersCatalog1.addUser(user5);
				
		new LoginScreen(usersCatalog1);
	}

}
