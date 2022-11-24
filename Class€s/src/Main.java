
public class Main {

	public static void main(String[] args) {
		//classlar reference type tır.
		
		CustomerManager customerManager = new CustomerManager();
	    customerManager.Update();
		customerManager.Add();
		customerManager.Remove();
	
		
		//integerlar,value type tır.
		int sayi1= 10;
		int sayi2= 20;
		sayi2= sayi1;
		sayi1= 30;
		System.out.println(sayi2);//??
	
		
		//arraylar de reference type tır.
		int[] nums1= new int[] {1,2,3};
		int[] nums2= new int[] {4,5,6};
		nums2 = nums1;
		nums1[0]= 10;
		System.out.println(nums2[0]);//??
	
	
	}

}
