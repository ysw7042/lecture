package realization;

//��Ŭ������ �̿��Ͽ� Ŭ������ �������̽��� �����Ͽ� �����ϴ� ���
// => Ŭ���� >> Refactor >> Extract Interface >> ����â >> �������̽��� �Է� �� �޼ҵ� ���� >> OK

//mysql DBMS(DataBase Management System)�� �̿��� �л����� ����� �����ϴ� Ŭ����
public class JdbcMysql implements Jdbc {
	@Override
	public void insert() {
		System.out.println("[mysql]�л������� ���� �Ͽ����ϴ�.");
	}
	
	@Override
	public void update() {
		System.out.println("[mysql]�л������� ���� �Ͽ����ϴ�.");
	}
	
	@Override
	public void delete() {
		System.out.println("[mysql]�л������� ���� �Ͽ����ϴ�.");
	}
	
	@Override
	public void select() {
		System.out.println("[mysql]�л������� �˻� �Ͽ����ϴ�.");
	}
}
