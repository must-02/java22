package polymorphismDemo;

public class E_mailLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("logged to email:"+ message);
	}

}
