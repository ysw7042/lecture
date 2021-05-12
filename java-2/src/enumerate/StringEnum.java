package enumerate;

public enum StringEnum {
	//����ʵ��� �ڷ����� �⺻������ ������(int)�� ���� 
	//�����ڰ� ����� ��� ����ʵ�� �����ڸ� �̿��Ͽ� ����
	// => ������ �Ű������� ���� �����Ͽ� ����ʵ� �ʱ�ȭ �۾�
	INSERT("����"),UPDATE("����"),DELETE("����"),SELECT("�˻�");
	
	//����ʵ��� �ڷ����� �����ϱ� ���ؼ��� �ʵ� ����
	// => private final �����ڸ� �̿��Ͽ� ���� 
	// => �ʵ带 �̿��Ͽ� ����ʵ忡 ���ϴ� �ʱⰪ�� �����ϱ� ���� ������ �ݵ�� ���� 
	private final String value;//����ʵ带 ǥ���ϱ� ���� �ʵ�
	
	//private final �ʵ带 ���� ����ʵ忡 �ʱⰪ�� �����ϱ� ���� ������ 
	// =>�����ڴ� �ݵ�� private �����ڸ� �̿��Ͽ� ���� 
	// => �Ű������� ���޵� ���� private final �ʵ忡 �����Ͽ� ����ʵ��� �ʱⰪ �ο� ����
	private StringEnum(String value) {
		this.value=value;
	}

	
	//private final �ʵ尪�� ��ȯ�ϴ� �޼ҵ� >> Getter �޼ҵ�
	// => Getter �޼ҵ带 ȣ���ϸ� ����ʵ忡 ����� �ʱⰪ ��ȯ 
	public String getValue() {
		return value;
	}
	
}
