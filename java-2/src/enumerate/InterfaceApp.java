package enumerate;

//Ŭ����(�������̽�)���� ����ʵ带 ������ ����� ����
// => ����ʵ带 �̿��Ͽ� ������(��ǥ��)���� ����ϱ� ������
// => ����ʵ带 �ǹ��ִ� ���ڿ��� ǥ�� �Ұ���
// => ����ʵ尡 ����� Ŭ����(�������̽�) ���ǹ�
//JDK 1.5�̻󿡼��� Ŭ���� (�������̽�)���� ����� ����ʵ��� ������ �����ϱ� ���� enum �ڷ��� �߰�  
public class InterfaceApp {
	public static void main(String[] args) {
		//�������̽��� ����� ����ʵ尪 ��� - ����ʵ�� ǥ���� �⺻�� ��� 
		System.out.println("���� = "+InterfaceOne.INSERT);
		System.out.println("���� = "+InterfaceOne.UPDATE);
		System.out.println("���� = "+InterfaceOne.DELETE);
		System.out.println("�˻� = "+InterfaceOne.SELECT);
		System.out.println("==============================================");
		System.out.println("���� = "+InterfaceTwo.ADD);
		System.out.println("���� = "+InterfaceTwo.MODIFY);
		System.out.println("���� = "+InterfaceTwo.REMOVE);
		System.out.println("�˻� = "+InterfaceTwo.SEARCH);
		System.out.println("==============================================");
		//����ʵ��� �ڷ����� ������ �ڷ����� ������ �����Ͽ� ����ʵ� ���� ����
		//int choice=InterfaceOne.INSERT;
		int choice=1;//������ ���� 
		System.out.println("���� = "+choice);
		System.out.println("==============================================");
		switch(choice) {
			//case InterfaceOne.INSERT;
			case InterfaceTwo.ADD:
				System.out.println("# �л������� �����մϴ�.");
				break;
			case InterfaceOne.UPDATE:
				System.out.println("# �л������� �����մϴ�.");
				break;
			case InterfaceOne.DELETE:
				System.out.println("# �л������� �����մϴ�.");
				break;
			case InterfaceOne.SELECT:
				System.out.println("# �л������� �˻��մϴ�.");
				break;
		}
		System.out.println("==============================================");
		
	}
}
