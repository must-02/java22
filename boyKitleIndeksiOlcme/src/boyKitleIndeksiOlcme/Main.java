package boyKitleIndeksiOlcme;

public class Main {

	public static void main(String[] args) {
		Boy boy = new Boy();
		Kitle kitle = new Kitle();
		
		Double returnValue = (kitle.Kitle(85)/boy.Boy(1.75));
		System.out.println(returnValue);
		
		if (returnValue <20) System.err.println("çok zayıfsın, kilo alman gerekiyor.");
		else if (returnValue<=27) System.out.println("normal kilodasın, böyle devam et.");
		else System.out.println("çok şişmansın, zayıflaman gerekiyor.");
	}

}
