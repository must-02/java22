package conditions;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Main {

	public static void main(String[] args) {
		int sayi = 20;
		if(sayi<20) {
			System.out.println("sayi 20 den küçük");
		}else if(sayi == 20) {
			System.out.println("sayi 20 ye eşit");
		}else {
			System.out.println("sayi 20 den büyüktür");
		}
        int sayi2 = 14;
        if(sayi2 < 20) {
        	System.out.println("sayi 20 den küçük");
        }
        if(sayi2 < 15) {
        	System.out.println("sayi 15 ten küçük");
        }
	}

}
