package mainComponents;

public class Screen {

	protected int width, height; //Τυπικα για επεκταση με GUI
	protected String title;
	
	public Screen(String aTitle) {
		super();
		this.title = aTitle;
	}

	public void showMessage(String aMessage) {
		System.out.println(aMessage);
	}

	public void displayScreen() {
		//Τυπικα για επεκταση με GUI
	}
	
	public String getTitle() {
		return this.title;
	}
}