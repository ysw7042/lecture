package xyz.itwill.app;

//import : �ٸ� ��Ű���� �ڷ���(������)�� ��Ȯ�ϰ� ǥ���ϱ� ���� ����ϴ� Ű����
// => ��Ŭ���������� �ڷ����� �ڵ� �ϼ�(Ctrl+Space)�ϸ� �ڵ����� import ����
//import ������ �����ϴ� ����Ű : [Ctrl]+[Shift]+[O]
import xyz.itwill.subject.OracleSubject;
import xyz.itwill.subject.JavaSubject;
import xyz.uniwill.subject.NetworkSubject;
//���� �̸��� �ڷ����� import ���� �Ұ��� - �ϳ��� �ڷ����� import ���� ����
//import xyz.uniwill.subject.JavaSubject;

public class SubjectApp {
	public static void main(String[] args) {
		//���� ��Ű���� �ڷ���(������)�� ��Ű�� ǥ������ �ڷ����� ����Ͽ� ��� ���� - �ڷ���
		//�ٸ� ��Ű���� �ڷ����� ��Ű���� ǥ���Ͽ� �ڷ����� ����ؾ߸� ��� ���� - ��Ű��.�ڷ���
		//xyz.itwill.subject.OracleSubject subject1=new xyz.itwill.subject.OracleSubject();
	
		//import ������ �ڷ����� ��Ű�� ǥ������ �ڷ����� ����Ͽ� ��� ����
		OracleSubject subject1=new OracleSubject();
		subject1.display();
		
		NetworkSubject subject2=new NetworkSubject();
		subject2.display();
		
		//���� �̸��� �ڷ����� ������ ��� ��Ű���� ����Ͽ� import ���� 
		JavaSubject subject3=new JavaSubject();
		subject3.display();
		
		//���� �̸��� �ڷ����� import �������� �ʱ� ������ ��Ű���� ����Ͽ� �ڷ��� ��� 
		xyz.uniwill.subject.JavaSubject subject4=new xyz.uniwill.subject.JavaSubject();
		subject4.display();
	}
}









