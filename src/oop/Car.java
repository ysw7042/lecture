package oop;

//�ڵ����� ǥ���ϱ� ���� Ŭ����(�ڷ���)
// => Ŭ������ �ۼ��� �� �ʵ� �Ǵ� �޼ҵ忡 ���� �����ڸ� �����Ͽ� ���� ���� ����
//���� ������(Access Modifier) : private, package, protected, public 
// => Ŭ����, �ʵ�, ������, �޼ҵ忡 �����Ͽ� ���� ������ �����ϴ� Ű����
// private : Ŭ���� ���ο����� ���� �����ϸ� �ܺο����� ���� �Ұ����ϵ��� �����ϴ� ������
// => �ʵ� ����� ��� : �ν��Ͻ� �ʵ忡 �������� ���� ���� - ����ȭ(Data Hiding)
// public : ��� ��Ű���� Ŭ�������� ���� �����ϵ��� �����ϴ� ������
// => �޼ҵ� ����� ��� : �޼ҵ带 ��� Ŭ�������� �����Ͽ� ��� �� �� �ֵ��� ����
public class Car {
	//�ʵ�(Field) : ǥ���� ��� ���� �Ӽ� ���� - �Ӽ��� ���� 
	// => Ŭ������ ����� ��� �޼ҵ忡�� �ʵ忡 �����Ͽ� ��� ����
	private String aliasName;//�̸�(��Ī) - ������
	private boolean engineStatus;//��������(�õ�����) - false : off, true : on
	private int currentSpeed;//����ӵ�
	
	//������(Constructor) : ��ü(�ν��Ͻ�)�� �����ϱ� ���� Ư���� �޼ҵ�
	// => �ϳ��� �����ڵ� �������� ������ �Ű������� ���� �⺻ �����ڰ� �����ϴ� ������ ó���ȴ�. 
	
	//�޼ҵ�(Method) : ǥ�� ��� ���� ���� ����   
	// => �ʵ带 �̿��Ͽ� ǥ�� ����� ������ ������� �ۼ��� ������� ���� 
	
	// �ڵ��� �õ��� �Ѵ� ������ ǥ���� �޼ҵ�
	public void startEngine() {
		engineStatus=true;
		System.out.println(aliasName+"�� �õ��� �׽��ϴ�.");
	}
 	
	// �ڵ��� �õ��� ���� ������ ǥ���� �޼ҵ�
	public void stopEngine() {
		if(currentSpeed!=0) {//���� �ӵ��� 0�� �ƴ� ��� 
			/*
			currentSpeed=0;	//return; �� �����ϴ�.
			System.out.println(aliasName+"�� �ڵ����� ������ϴ�.");
			*/
			
			//Ŭ���� ���ο� ����� �޼ҵ�� ���� ȣ�� ����
			// => �ڵ��� �ߺ��� �ּ�ȭ : ���������� ȿ���� ����
			speedZero();
		}
		
		engineStatus=false;
		System.out.println(aliasName+"�� �õ��� �����ϴ�.");
	}
	
	//�ڵ��� �ӵ��� �����ϴ� ������ ǥ���� �޼ҵ� 
	public void speedUp(int speed) {
		if(!engineStatus) {//������ ���� �ִ� ���
			System.out.println(aliasName+"�� �õ��� ���� �ֽ��ϴ�.");
			return;
		}
		
		//�Ű������� ���������� ���� ���޵� ��� 
		if(currentSpeed+speed>150) {//���� if��ó�� �������� �Է��� ��ȯ ���� ����� ���� �ִ�.
			speed=150-currentSpeed;
		}
		
		currentSpeed+=speed; //currentSpeed �� ����ӵ� speed�� ���� ������ ��ŭ �ӵ��� �����Ѵ�. 
		System.out.println(aliasName+"�� �ӵ��� "+speed
				+"Km/h ���� �Ǿ����ϴ�. ���� �ӵ��� "+currentSpeed+"Km/h �Դϴ�.");
	}
	
	//�ڵ��� �ӵ��� �����ϴ� ������ ǥ���� �޼ҵ�
	public void speedDown(int speed) {
		if(!engineStatus) {//������ ���� �ִ� ���
			System.out.println(aliasName+"�� �õ��� ���� �ֽ��ϴ�.");
			return;
		}
		
		if(currentSpeed<speed) {
			speed=currentSpeed;
		}
		
		currentSpeed-=speed; //currentSpeed �� ����ӵ� speed�� ���� ������ ��ŭ �ӵ��� �����Ѵ�. 
		System.out.println(aliasName+"�� �ӵ��� "+speed
				+"Km/h ���� �Ǿ����ϴ�. ���� �ӵ��� "+currentSpeed+"Km/h �Դϴ�.");
	}
	
	//�ڵ����� ���ߴ� ������ ǥ���� �޼ҵ� 
	public void speedZero() {
		currentSpeed=0;
		System.out.println(aliasName+"�� �ڵ����� ������ϴ�.");
	}
	
	
	//����ȭ ����� �ʵ�� �ʵ尪�� ��ȯ�ϴ� Getter �޼ҵ��  
	//�ʵ尪�� �����ϴ� Setter �޼ҵ� ���� >> ĸ��ȭ 
	//ĸ��ȭ(Getter & Setter) �޼ҵ� �ڵ� ���� ����Ű
	//[Alt+Shift]+[s] >> �˾��޴� >> [R] >> ���� �޴� >> �ʵ� ���� >> Generate
	public String getAliasName() {//Getter �޼ҵ� - �޼ҵ�� : get�ʵ�� 
		return aliasName; //�ʵ尪 ��ȯ
	}
	
	
	public void setAliasName(String aliasName) {//Setter �޼ҵ� - �޼ҵ�� : set�ʵ�� ��ȯ���� void 
		//�Ű������� ���޵Ǿ� ����� ������ �ʵ尪 ����
		// => �Ű������� ���޵� ���� ���� ��ȿ�� �˻� //�������� ���鸸 ����� �� �ֵ��� �Ѵ�.
		this.aliasName=aliasName;//�ʵ尪 ���� //aliasName�̶�� �Ű������� �� ������ ������ 
											   //�Ű����� aliasName�� ���� �Ǳ� ������ ��� �߻� (this.)�� �̿�
	}
	
	//����ȭ ����� �ʵ� �ڷ����� boolean�� ��� Is �޼ҵ�� ����
	public boolean isEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	
}









