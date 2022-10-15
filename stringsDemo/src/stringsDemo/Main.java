package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String msj= "Bug ün Hav a Ç ok Güz el";
		
		System.out.println("eleman sayısı:"+msj.length());
		System.out.println("5.eleman:"+ msj.charAt(4));
		System.out.println(msj.concat(" . Yaşasın!!"));
		System.out.println(msj.startsWith("b"));
		System.out.println(msj.endsWith("e"));
		
		char[] karakterler = new char[6];
		msj.getChars(0, 6, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(karakterler.length);
		for(int i=0;i<karakterler.length;i++) {
			System.out.println(karakterler[i]);
		}
		System.out.println(msj.indexOf("a"));
		System.out.println(msj.lastIndexOf("a"));
		System.out.println(msj.replace(" ", "|"));
		System.out.println(msj.substring(6,10));
		
		for(String kelime: msj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(msj.toLowerCase());
		System.out.println(msj.toUpperCase());
		System.out.println(msj.trim());
	}

}
