package abstractClassess;

public class Main {

	public static void main(String[] args) {
//		GameCalculater gmaeCalculater= new GameCalculater() {
//
//			@Override
//			public void hesapla() {
//				
//				
//			}
//			
//		
//	};Böyle kullanılabilir ama aşağıdaki kullanım daha iyidir:
		GameCalculater gameCalculater = new KidsGameCalculator();
		gameCalculater.gameOver();
}
}
