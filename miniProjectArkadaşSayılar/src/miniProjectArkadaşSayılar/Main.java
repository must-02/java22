package miniProjectArkadaşSayılar;

public class Main {

	public static void main(String[] args) {
		//en küçük ark. sayılar 220-284tür.
		//220nin bölenleri toplamı 284e eşittir.
		//284ün bölenleri toplamı 220ye eşittir.
		int num1= 1210;
		int num2= 1184;
		int tp1= 0;
		int tp2= 0;
		
		for(int i=1;i<num1;i++) {
			if(num1 % i== 0) {
				tp1 += i;
			}
		}
		for(int d=1;d<num2;d++) {
			if(num2 % d== 0) {
				tp2 += d;
			}
		}
		if(tp1 == num2 && tp2 == num1) {
			System.out.println("bu sayılar ark. sayı");
		}else {
			System.out.println("bu sayılar ark. sayı değil");
		}
	
	
	}
	

}
