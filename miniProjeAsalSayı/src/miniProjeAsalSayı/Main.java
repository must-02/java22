package miniProjeAsalSayı;

public class Main {

	public static void main(String[] args) {
		int num = -345;
		//int remainder1 = num % 2;
		// System.out.println(remainder1);çıktısı 1 çünkü 25in 2ye bölümünden kalan
		// 1dir.
		if(num==1) {
			System.out.println("sayı asal değil.");
			return;
		}
		
		if(num<1) {
			System.out.println("en küçük asal sayı 2...");
			return;
		}
		
		
		boolean isPrime= true;
		for(int i= 2;i<num;i++) {
			if(num % i ==0) {
				isPrime= false;
			}
		}
		if(isPrime) {
			System.out.println("sayı asal");
		}else {
			System.out.println("sayı asal değil");
		}
	
	
	}

}
