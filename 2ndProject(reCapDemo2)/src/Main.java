

public class Main {

	public static void main(String[] args) {
		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double eb = myList[0];
		for (double list : myList) {
			if (eb < list) {
				eb = list;
			}
			total = total + list;
			System.out.println(list);
		}
		System.out.println("toplam: " + total);
		System.out.println("en buyuk:" + eb);
		System.out.println("-|-|-|-|-|-|-");

		myList = new double[] { 1.2, 6.3, 4.3, 5.6 };
		total = 0;
		eb = myList[0];
		for (double list : myList) {
			if (eb < list) {
				eb = list;
			}
			total = total + list;
			System.out.println(list);
		}
		System.out.println("toplam: " + total);
		System.out.println("en buyuk:" + eb);
		System.out.println("a");
	}

}
