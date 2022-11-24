

public class Main {

	public static void main(String[] args) {
		int tp= sum(6,0);
		System.out.println(tp);
		String sehır= city();
		System.out.println(sehır);
		int total= topla2(2,3,4,5,6,7,8,9);
		System.out.println(total);
	
	}
	public static int sum(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public static String city() {
		return "ankara";
		
	}
	//Variable Arguments--->çoklu parametre verme işlemi diyebiliriz
	public static int topla2(int... sayilar) {
		int total= 0;
		for(int sayi: sayilar) {
			total+=sayi;
		}
		return total;
	}


}
