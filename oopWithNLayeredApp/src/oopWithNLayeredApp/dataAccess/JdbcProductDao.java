package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	public void add(Product product) {
		//buraya sadece ve sadece db erişim kodları yazılır...
		//bunun için SQl gibi programlar bilmek gerekir.
		System.out.println("added to DB with JDBC");
	}
}
