package mainComponents;

public class Screen {

	protected int width, height; //������ ��� �������� �� GUI
	protected String title;
	
	public Screen(String aTitle) {
		super();
		this.title = aTitle;
	}

	public void showMessage(String aMessage) {
		System.out.println(aMessage);
	} 
	//sdaasdasd

	public void displayScreen() {
		//������ ��� �������� �� GUI
	}
	
	public String getTitle() {
		return this.title;
	}
}