package interfaces;

public class SqlServerCustomerDal implements ICustomerDal{

	@Override
	public void Add() {
		System.out.println("sql server'a eklendi");
	}

}
