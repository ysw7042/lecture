package realization;

//DBMS�� �̿��� �л� ���� ���α�
public class JdbcApp {
	public static void main(String[] args) {
		/*
		JdbcMysql mysql=new JdbcMysql();
		
		mysql.insert();
		mysql.update();
		mysql.delete();
		mysql.select();
		*/
		
		/*
		//�ý��� ���濡 ���� Ŭ���� ����� ���α׷��� ��κ��� ���� ó��
		// => Ŭ���� ���� ���յ��� ���� ���������� ȿ���� ���� 
		JdbcOracle oracle=new JdbcOracle();
		
		oracle.add();
		oracle.modify();
		oracle.remove();
		oracle.search();
		*/
		
		//�������̽��� �̿��Ͽ� Ŭ������ �ۼ��� ��� �ý��� ���濡 ���� Ŭ���� ����� 
		//���α׷��� �Ϻκи� ���� ó�� ����
		// => Ŭ���� ���� ���յ��� ���� ���������� ȿ���� ����
		//JdbcMysql jdbc=new JdbcMysql();
		//JdbcOracle jdbc=new JdbcOracle();
		
		//���������� �θ� �������̽��� �̿��Ͽ� �����ϴ� ���� ����
		//Jdbc jdbc=new JdbcMysql();
		Jdbc jdbc=new JdbcOracle();
		
		jdbc.insert();
		jdbc.update();
		jdbc.delete();
		jdbc.select();
	}
}
