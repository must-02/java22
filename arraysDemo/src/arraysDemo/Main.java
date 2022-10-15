package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String[] ogrencıler = new String[3];
		ogrencıler[0] = "engin";
		ogrencıler[1] = "derin";
		ogrencıler[2] = "salih";
		
		for(int i=0;i<ogrencıler.length;i++) {
			System.out.println(ogrencıler[i]);
		}
		System.out.println("-|-|-|-|-|-|-");
		for(String ogrenci:ogrencıler) {
			System.out.println(ogrenci);
		}
	}

}
