package oop;

//Car Ŭ������ �̿��Ͽ� �ۼ��� ���α׷�
public class CarApp {
	public static void main(String[] args) {
		//Ŭ������ ��ü(�ν��Ͻ�)�� �����Ͽ� ���������� ����
		//����) Ŭ������ ��������=new Ŭ������()
		//��ü(�ν��Ͻ�)�� �����ϸ� �ν��Ͻ� �ʵ忡�� �⺻���� �ڵ����� ����Ǿ� �ʱ�ȭ
		// => �⺻�� - ������ : 0, ���� : false, ������ : null 
		Car carOne=new Car();
		Car carTwo=new Car();
		
		System.out.println("carOne = "+carOne);
		System.out.println("carTwo = "+carTwo);
		System.out.println("=====================================================");
		//���������� �̿��Ͽ� ���������� ����� ��ü(�ν��Ͻ�)�� ��ҿ� �����Ͽ� ���
		// => . �����ڸ� �̿��Ͽ� ��ü(�ν��Ͻ�)�� ���(�ʵ� �Ǵ� �޼ҵ�) ����
		carOne.aliasName="Ƽ��";
		carOne.engineStatus=false;
		carOne.currentSpeed=0;
		
		System.out.println("ù��° �ڵ����� ��Ī = "+carOne.aliasName);
		System.out.println("ù��° �ڵ����� �������� = "+carOne.engineStatus);
		System.out.println("ù��° �ڵ����� ����ӵ� = "+carOne.currentSpeed);
		System.out.println("=====================================================");
		carTwo.aliasName="��Ÿ��";
		
		System.out.println("�ι�° �ڵ����� ��Ī = "+carTwo.aliasName);
		System.out.println("�ι�° �ڵ����� �������� = "+carTwo.engineStatus);
		System.out.println("�ι�° �ڵ����� ����ӵ� = "+carTwo.currentSpeed);
		System.out.println("=====================================================");
		//��ü(�ν��Ͻ�)�� �̿��Ͽ� �޼ҵ� ȣ�� - ��� ����
		carOne.startEngine();
		carOne.speedUp(30);
		carOne.speedUp(50);
		carOne.speedDown(40);
		carOne.speedZero();
		carOne.stopEngine();
		System.out.println("=====================================================");
	}
}













