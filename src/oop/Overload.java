package oop;

public class Overload {
	public void dispalyInt(int param) {
		System.out.println("������ = "+param);
	}
	
	public void displayBoolean(boolean param) {
		System.out.println("���� = "+param);
	}
	
	public void displayString(String param) {
		System.out.println("���ڿ� = "+param);
	}
	
	//�޼ҵ� �����ε�(Method Overload) ���� : �ϳ��� Ŭ�������� ������ ����� �����ϴ� 	
	//�޼ҵ尡 �Ű������� ���� ���� �� �����ؾ� �� ��� �żҵ���� ���� �����ϴ� ���
	// => �Ű������� ���� �Ǵ� �ڷ����� ���� �ʵ��� ����
	// => ���� ������ �Ǵ� ��ȯ���� �����ε� ����� �����ϴ�. 
	public void dispaly(int param) {
		System.out.println("������ = "+param);
	}
	
	/*
	public int dispaly(int param) {
		System.out.println("������ = "+param);
	} 
	*/
	
	public void display(boolean param) {
		System.out.println("���� = "+param);
	}
	
	public void display(String param) {
		System.out.println("���ڿ� = "+param);
	}
	
}
