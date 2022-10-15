package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'O';
		switch (grade) {
		case 'A':
			System.out.println("geçtiniz");
			break;
		case 'B':
			System.out.println("geçtiniz");
			break;
		case 'C'://Böyle de kullanılabiliyoruz anlamı c ve d değerleri için aynı sonuç çıkar
		case 'D':
			System.out.println("geçtiniz");
			break;
		case 'F':
			System.out.println("kaldınız");
			break;
		default:
			System.out.println("geçersiz not değeri girdiniz");
		}

	}

}
