package pre_oop;

public class Gasexample {
	public static void main(String[] args) {
		Gas mygas = new Gas();
		
		mygas.setGas(5);
		
		boolean gasState = mygas.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.");
			mygas.run();
		}
		
		if(mygas.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else {
			System.out.println("gas�� �����ϼ���.");
		}
	}
}
