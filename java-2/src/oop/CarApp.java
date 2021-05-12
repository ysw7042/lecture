package oop;

//Car Ŭ������ �̿��Ͽ� �ۼ��� ���α׷�
public class CarApp {
	public static void main(String[] args) {
		//Ŭ������ ��ü(�ν��Ͻ�)�� �����Ͽ� ���������� ����
		//����) Ŭ������ ��������=new Ŭ������()
		//��ü(�ν��Ͻ�)�� �����ϸ� �ν��Ͻ� �ʵ忡�� �⺻���� �ڵ����� ����Ǿ� �ʱ�ȭ
		// => �⺻�� - ������ : 0, ���� : false, ������ : null 
		Car carOne =new Car();
		Car carTwo =new Car();
		
		System.out.println("carOne ="+carOne);
		System.out.println("carTwo ="+carTwo);
		System.out.println("========================================================");
		//���������� �̿��Ͽ� ���������� ����� ��ü(�ν��Ͻ�)�� ��ҿ� �����Ͽ� ���
		// => . �����ڸ� �̿��Ͽ� ��ü(�ν��Ͻ�)�� ���(�ʵ� �Ǵ� �޼ҵ�)�� ���� 
		//������)�ν��Ͻ��� �ʵ忡 �������� ������ ����� ��� ���������� �� ���忡
		//���� ������ �� �� ���� ���� ����� �߸��Ǵ� ���� �߻� ����
		//�ذ��)�ν��Ͻ��� �ʵ忡 �������� ������ ������� �ʵ��� �ʵ��� ����ȭ ó��
		// => ����ȭ ����� �ʵ忡 ������ ��� ���� �߻�
		// => Getter �޼ҵ�� Setter �޼ҵ带 ȣ���Ͽ� �ʵ带 ���������� �����Ͽ� ���� 
		//carOne.aliasName="Ƽ��";
		carOne.setAliasName("Ƽ��");//setter �޼ҵ带 ȣ���Ͽ� �ʵ尪 ����
		//carOne.engineStatus=false;
		carOne.setEngineStatus(false);
		//carOne.currentSpeed=0;
		carOne.setCurrentSpeed(0);
		
		//System.out.println("ù��° �ڵ����� ��Ī = "+carOne.aliasName);
		//Getter �޼ҵ带 ȣ���Ͽ� �ʵ尪�� ��ȯ�޾� ���
		System.out.println("ù��° �ڵ����� ��Ī = "+carOne.getAliasName());
		//System.out.println("ù��° �ڵ����� �������� = "+carOne.engineStatus);
		System.out.println("ù��° �ڵ����� �������� = "+carOne.isEngineStatus());
		//System.out.println("ù��° �ڵ����� ����ӵ� = "+carOne.currentSpeed);
		System.out.println("ù��° �ڵ����� ����ӵ� = "+carOne.getCurrentSpeed());
		System.out.println("========================================================");
		//carTwo.aliasName="��Ÿ��";
		carTwo.setAliasName("��Ÿ��");
		
		//System.out.println("�ι�° �ڵ����� ��Ī = "+carTwo.aliasName);//�⺻���� null(�������� �ʾ� �����Ҽ�����)�̴�.
		System.out.println("�ι�° �ڵ����� ��Ī = "+carTwo.getAliasName());
		//System.out.println("�ι�° �ڵ����� �������� = "+carTwo.engineStatus);
		System.out.println("�ι�° �ڵ����� �������� = "+carTwo.isEngineStatus());
		//System.out.println("�ι�° �ڵ����� ����ӵ� = "+carTwo.currentSpeed);
		System.out.println("�ι�° �ڵ����� ����ӵ� = "+carTwo.getCurrentSpeed());
		System.out.println("========================================================");
		//��ü(�ν��Ͻ�)�� �̿��Ͽ� �޼ҵ� ȣ�� - ��� ����
		carOne.startEngine();
		carOne.speedUp(30);
		carOne.speedUp(50);
		carOne.speedDown(40);
		//carOne.speedZero();
		carOne.stopEngine();
		System.out.println("========================================================");
	}
}
