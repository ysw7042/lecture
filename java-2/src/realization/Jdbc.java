package realization;

//DBMS�� �̿��Ͽ� �л����� ����� �����ϴ� Ŭ������ �ݵ�� ��ӹ޾ƾ� �Ǵ� �������̽�
// => ��ӹ��� �ڽ� Ŭ�������� �޼ҵ� �ۼ� ��Ģ ����
public interface Jdbc {
	void insert();
	void update();
	void delete();
	void select();
}