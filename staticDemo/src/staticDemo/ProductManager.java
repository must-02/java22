package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//new'lemeden de yapılabilir
		//ProductValidator validator = new ProductValidator();
		if(ProductValidator.isValid(product)) {
			System.out.println("eklendi");
		}else {
			System.out.println("ürün bilgileri geçersiz.");
		}
		ProductValidator productValidator = new ProductValidator();
		productValidator.bırFonk();
	}
}
