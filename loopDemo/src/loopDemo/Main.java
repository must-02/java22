package loopDemo;

public class Main {

	public static void main(String[] args) {
		//FOR
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			
		}
		
		System.out.println("for1 bitti");
		for(int i=1;i<=10;i+=2) {
			System.out.println(i);
		}
		System.out.println("for2 bitti");
		int i = 1;
		//WHİLE
		while (i<10){
			System.out.println(i);
			i++;
		}
		System.out.println("while bitti");

	    //DO_WHİLE
	    int j = 1;
	    do {
	    	System.out.println(j);
			j+=2;
	    }while(j<10);
	    System.out.println("do_while bitti");
	}
}
