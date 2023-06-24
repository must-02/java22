package setAndGetMethodsExamples;

public class Product {
	private String name;
	private int unıtInStcok;
	private double price;
	private String imageUrl;
	private double discount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnıtInStcok() {
		return unıtInStcok;
	}

	public void setUnıtInStcok(int unıtInStcok) {
		this.unıtInStcok = unıtInStcok;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
