package staticDemo;

public class ProductValidator {//static ile bir fonk. bir defa kullanabiliyoruz
							   // ve başka kişiler için de değeri değişmiyor.
	static {
		System.out.println("Static yapıcı blok çalıştı.");
	}//burası newlenmeden de çalışabilir.
	
	public ProductValidator() {
		System.out.println("yapıcı blok çalıştı.");
	}// yapıcı bloklar da(constructorlar) newlenince çalışır.
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public void bırFonk() {
	//bunu başkaclass'ta kullanmakiçin buclass'ı(ProductValidator)orda newlemen gerek.
	}
	//inner classlarda(ana classın içindeki classlar) static yazabiliriz.
	//ama ana class static'lenemez.
}
