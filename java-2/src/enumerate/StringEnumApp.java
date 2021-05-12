package enumerate;

public class StringEnumApp {
	public static void main(String[] args) {
		//����ʵ� ��� - ����ʵ�� ���
		System.out.println("StringEnum.INSERT = "+StringEnum.INSERT);
		System.out.println("StringEnum.UPDATE = "+StringEnum.UPDATE);
		System.out.println("StringEnum.DELETE = "+StringEnum.DELETE);
		System.out.println("StringEnum.SELECT = "+StringEnum.SELECT);
		System.out.println("==============================================");
		//�������� ����ʵ忡 ���� Getter �޼ҵ带 ȣ���Ͽ� ����ʵ尪 ��ȯ
		System.out.println("StringEnum.INSERT = "+StringEnum.INSERT.getValue());
		System.out.println("StringEnum.UPDATE = "+StringEnum.UPDATE.getValue());
		System.out.println("StringEnum.DELETE = "+StringEnum.DELETE.getValue());
		System.out.println("StringEnum.SELECT = "+StringEnum.SELECT.getValue());
		System.out.println("==============================================");
		//EnumType.values() : �������� ����� ��� ����ʵ带 �迭�� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		for(StringEnum temp:StringEnum.values()) {
			//EnumType.ordinal() : ����ʵ带 �����ϱ� ���� ÷��(Index)�� ��ȯ�ϴ� �޼ҵ�
			System.out.println(temp+ " = "+temp.getValue()+" >> "+temp.ordinal());
		}
		System.out.println("==============================================");
	}
}
