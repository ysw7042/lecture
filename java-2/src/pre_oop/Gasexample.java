package pre_oop;

public class Gasexample {
	public static void main(String[] args) {
		Gas mygas = new Gas();
		
		mygas.setGas(5);
		
		boolean gasState = mygas.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			mygas.run();
		}
		
		if(mygas.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
