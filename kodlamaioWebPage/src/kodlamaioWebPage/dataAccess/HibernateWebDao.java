package kodlamaioWebPage.dataAccess;

public class HibernateWebDao implements WebDao{

	@Override
	public void add() {
		System.out.println("added to db with Hibernate.");
		
	}

}
