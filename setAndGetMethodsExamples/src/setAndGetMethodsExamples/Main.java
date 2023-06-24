package setAndGetMethodsExamples;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
	
		product1.setName("Delonghi kahve makinesi");
		product1.setDiscount(7);
		product1.setImageUrl("image1.jpg");
		product1.setPrice(7500);
		product1.setUnıtInStcok(3);
		
		Product product2 = new Product();
		
		product2.setName("Smeg kahve makinesi");
		product2.setDiscount(7);
		product2.setImageUrl("image2.jpg");
		product2.setPrice(7500);
		product2.setUnıtInStcok(3);
		
		Product product3 = new Product();
		
		product3.setName("Kitchen Aid kahve makinesi");
		product3.setDiscount(7);
		product3.setImageUrl("image3.jpg");
		product3.setPrice(7500);
		product3.setUnıtInStcok(3);
		
		Product[] products= {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
	}	

}
