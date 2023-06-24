package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao,Logger[] loggers) {
		this.loggers= loggers;
		this.productDao = productDao;
	}

	public void add(Product product)throws Exception {
		//iş kuralları
		if (product.getUnitPrice()<10) {
			throw new Exception("ürün fiyatı 10 dan küçük olamaz.");
		}
		//bu kötü kod(alttaki)
		//ProductDao productDao = new JdbcProductDao();
		productDao.add(product);
	
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
	}

}
