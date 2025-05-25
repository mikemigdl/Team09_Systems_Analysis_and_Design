package sales;
import products.Product;

public class Sale {

	private String id;
	private Product product;
	private int quantity;
	private String date;
	public String getId() {
		return id;
	}
	public Product getProduct() {
		return product;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getDate() {
		return date;
	}

}