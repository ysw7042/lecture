package inheritance;

//�ڵ��� ����(�����ڸ�, �𵨸�)�� �����ϱ� ���� Ŭ����
//�θ� Ŭ������ ���� ��� �⺻������ Object Ŭ���� ���
// => Object Ŭ������ ������ ��� Java Ŭ������ ������ Object Ŭ���� ���
//Object : ��� Java Ŭ������ �ּ��� Ŭ����
// => Object Ŭ������ ������ ������������ ��� Java �ν��Ͻ� ���� ����
public class Car /* extends Object */ {
	private String userName;
	private String modelName;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String userName, String modelName) {
		super();
		this.userName = userName;
		this.modelName = modelName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	//�ν��Ͻ� �ʵ尪�� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
	// => �ν��Ͻ� �ʵ尪�� Ȯ���ϱ� ���� �������� �������̵� ����
	@Override
	public String toString() {
		return "������ : "+userName+", �𵨸� : "+modelName;
	}
}
