package realization;

public class WolfHumanApp {
	public static void main(String[] args) {
		WolfHuman wolfHuman=new WolfHuman();
		
		wolfHuman.speak();
		wolfHuman.walk();
		wolfHuman.smile();
		wolfHuman.change();
		wolfHuman.cryLoudly();
		wolfHuman.fastWalk();
		System.out.println("=================================================");
		//�θ� Ŭ������ ���������� �����Ͽ� �ڽ� Ŭ������ �����ڷ� �ν��Ͻ��� �����Ͽ� ����
		// => ���������� �θ� �ν��Ͻ��� �޼ҵ常 ȣ�� ����
		// => ��ü ����ȯ�� �̿��ϸ� �ڽ� �ν��Ͻ��� �޼ҵ� ȣ�� ����
		Human human=new WolfHuman();

		human.speak();
		human.walk();
		human.smile();
		System.out.println("=================================================");
		//����� ��ü ����ȯ�� �̿��Ͽ� �ڽ� �ν��Ͻ��� �޼ҵ� ȣ��
		((WolfHuman)human).change();
		System.out.println("=================================================");
		//�������̽��� �̿��Ͽ� �������� ����
		// => �ڽ� Ŭ������ �����ڷ� �ν��Ͻ��� �����Ͽ� ���� ����
		//Wolf wolf=new WolfHuman();
		
		//�ڽ� Ŭ������ ���� �θ� Ŭ���� �Ǵ� �θ� �������̽��� ���� ����� ��ü ����ȯ��
		//�̿��Ͽ� �ڽ� �ν��Ͻ� ���� ����
		Wolf wolf=(Wolf)human;
		
		//������ ��ü ����ȯ�� ���� �ڽ� �ν��Ͻ��� �޼ҵ� ȣ��
		wolf.cryLoudly();
		wolf.fastWalk();
		System.out.println("=================================================");
		
		
	}
}











