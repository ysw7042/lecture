package realization;

public class PrintApp {
	public static void main(String[] args) {
		//�⺻ �޼ҵ带 ȣ���ϱ� ���ؼ��� ���������� �θ� �������̽��� ����
		Printable printOne=new PrintSingle();
		
		printOne.print();
		printOne.scan();//�θ� �������̽��� �⺻ �޼ҵ� ȣ��
		System.out.println("====================================================");
		Printable printTwo=new PrintMultiple();
		
		printTwo.print();
		printTwo.scan();//�ڽ� �ν��Ͻ��� �������̵� �޼ҵ� ȣ��
		System.out.println("====================================================");
	}
}
