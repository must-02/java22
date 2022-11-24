package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		//JDBC-->bu kodları yazarak veri tabanına kaydedeceğiz.
		System.out.println("ürün eklendi:"+ product.get_name());
		
	}
	public void Remove(Product product) {
		System.out.println("ürün kaldırıldı:"+ product.get_name());
	}
}
