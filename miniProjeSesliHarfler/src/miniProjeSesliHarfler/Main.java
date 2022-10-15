package miniProjeSesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'Ğ';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("kalın sesli harf");
			break;
		case 'E':
		case 'İ':
		case 'Ü':
		case 'Ö':
			System.out.println("ince sesli harf");
			break;
		default:
			System.out.println("sesli harf değil");

		}

	}

}
