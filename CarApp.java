package inheritance;

public class CarApp {
	public static void main(String[] args) {
		Car car=new Car("ȫ�浿", "��Ÿ��");
		
		System.out.println("������ = "+car.getUserName());
		System.out.println("�𵨸� = "+car.getModelName());
		System.out.println("=========================================================");
		//Car Ŭ������ Object Ŭ������ ��� �ޱ� ������ Object Ŭ������ �޼ҵ� ȣ�� ����
		//Object.toString() : �ν��Ͻ��� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		//Car Ŭ�������� toString() �޼ҵ带 �������̵� �����ϸ� Object Ŭ������ toString()
		//�޼ҵ�� �������� Car Ŭ������ toString() �޼ҵ� ȣ�� - Car �ν��Ͻ��� �ʵ尪 Ȯ�� 
		System.out.println("car.toString() = "+car.toString());
		
		//���������� ����� �ν��Ͻ��� ����� ��� Object Ŭ������ toString() �޼ҵ尡
		//�ڵ� ȣ���Ͽ� �ν��Ͻ��� ���ڿ��� ��ȯ�޾� ���
		System.out.println("car = "+car);
		System.out.println("=========================================================");
		String name="ȫ�浿";
		
		//String Ŭ�������� toString() �޼ҵ带 �������̵� �����Ͽ� String Ŭ������ toString() �޼ҵ� ȣ��
		//String.toString() : String �ν��Ͻ��� ����� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		System.out.println("name.toString() = "+name.toString());
		//���������� �ν��Ͻ��� ����� ��� �ڵ����� toString() �޼ҵ� ȣ��
		System.out.println("name = "+name);
		System.out.println("=========================================================");
	}
}











