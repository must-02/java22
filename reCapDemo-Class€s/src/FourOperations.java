
public class FourOperations {
	
	public int Plus(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public int Minus(int sayi1,int sayi2) {
		return sayi1-sayi2;
	}
	public int Multiple(int sayi1,int sayi2) {
		return sayi1*sayi2;
	}
	public int Divide(int sayi1,int sayi2) {
		if(sayi2 == 0) {
			System.err.println("Cannot be divided with 0");
		}
		return sayi1/sayi2;
	}
}
