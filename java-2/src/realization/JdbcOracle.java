package realization;

//oracle DBMS(DataBase Management System)�� �̿��� �л����� ����� �����ϴ� Ŭ����
public class JdbcOracle implements Jdbc {
	/*
	public void add() {
		System.out.println("[oracle]�л������� ���� �Ͽ����ϴ�.");
	} 
	
	public void modify() {
		System.out.println("[oracle]�л������� ���� �Ͽ����ϴ�.");
	}
	
	public void remove() {
		System.out.println("[oracle]�л������� ���� �Ͽ����ϴ�.");
	}
	
	public void search() {
		System.out.println("[oracle]�л������� �˻� �Ͽ����ϴ�.");
	}
	*/

	@Override
	public void insert() {
		System.out.println("[oracle]�л������� ���� �Ͽ����ϴ�.");
	}

	@Override
	public void update() {
		System.out.println("[oracle]�л������� ���� �Ͽ����ϴ�.");
	}

	@Override
	public void delete() {
		System.out.println("[oracle]�л������� ���� �Ͽ����ϴ�.");
	}

	@Override
	public void select() {
		System.out.println("[oracle]�л������� �˻� �Ͽ����ϴ�.");
	}
}
