package oop;

//�ڵ����� ǥ���ϱ� ���� Ŭ����
public class Car {
	//�ʵ�(Field) : ǥ�� ��� ���� �Ӽ� ���� - �Ӽ��� ����
	// => Ŭ������ ����� ��� �޼ҵ忡�� �ʵ忡 �����Ͽ� ��� ����
	String aliasName;//�̸�(��Ī) - ������
	boolean engineStatus;//��������(�õ�����) - false : Off, true : On
	int currentSpeed;//����ӵ�
	
	//������(Constructor) : ��ü(�ν��Ͻ�)�� �����ϱ� ���� Ư���� �޼ҵ�
	// => �ϳ��� �����ڵ� �������� ������ �Ű������� ���� �⺻ �����ڰ� �����ϴ� ������ ó��
	
	//�޼ҵ�(Method) : ǥ�� ��� ���� ���� ����
	// => �ʵ带 �̿��Ͽ� ǥ�� ����� ������ ������� �ۼ��� ������� ����
	//�ڵ��� �õ��� �״� ������ ǥ���� �޼ҵ�
	void startEngine() {
		engineStatus=true;
		System.out.println(aliasName+"�� �õ��� �׽��ϴ�.");
	}
	
	//�ڵ��� �õ��� ���� ������ ǥ���� �޼ҵ�
	void stopEngine() {
		engineStatus=false;
		System.out.println(aliasName+"�� �õ��� �����ϴ�.");
	}
	
	//�ڵ��� �ӵ��� �����ϴ� ������ ǥ���� �޼ҵ�
	void speedUp(int speed) {
		currentSpeed+=speed;
		System.out.println(aliasName+"�� �ӵ��� "+speed
				+"Km/h ���� �Ǿ����ϴ�. ���� �ӵ��� "+currentSpeed+"Km/h �Դϴ�.");
	}

	//�ڵ��� �ӵ��� �����ϴ� ������ ǥ���� �޼ҵ�
	void speedDown(int speed) {
		currentSpeed-=speed;
		System.out.println(aliasName+"�� �ӵ��� "+speed
				+"Km/h ���� �Ǿ����ϴ�. ���� �ӵ��� "+currentSpeed+"Km/h �Դϴ�.");
	}
	
	//�ڵ����� ���ߴ� ������ ǥ���� �޼ҵ�
	void speedZero() {
		currentSpeed=0;
		System.out.println(aliasName+"�� �ڵ����� ������ϴ�.");
	}
}







