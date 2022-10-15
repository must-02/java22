package miniProjeSayıBulma;

public class Main {

	public static void main(String[] args) {
		int[] nums= new int[] {1,2,5,7,9,0};
		int wanted= 8;
		boolean isThere = false;
		
		for(int num: nums) {
			if(wanted == num) {
				isThere= true;
				break;				
			}
		}
		if(isThere) {
			System.out.println("vardır.");
		}else {
			System.out.println("yoktur.");
		}	
	}

}
