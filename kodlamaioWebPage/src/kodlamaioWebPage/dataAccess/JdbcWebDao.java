package kodlamaioWebPage.dataAccess;

public class JdbcWebDao implements WebDao{

	@Override
	public void add() {
		System.out.println("added to db with JDBC.");
		
	}

}
