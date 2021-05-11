package inheritance;

//�������(�����ȣ,����̸�)�� �����ϱ� ���� Ŭ����
// => �ν��Ͻ� ������ ������ �ƴ� ����� ������ Ŭ������ �ۼ� - �߻� Ŭ������ ����
//�߻� Ŭ����(Abstract Class) : abstract �����ڸ� �̿��Ͽ� ����� Ŭ����
// => �ν��Ͻ��� ������ �� ���� Ŭ����
public abstract class Employee {
	private int empNo;
	private String empName;
	
	//����ʵ�(Constant Field) : �� ��� �ǹ��ִ� �ܾ ����Ͽ� ���� ǥ���ϱ� ���� ����
	// => public static final �����ڸ� �̿��Ͽ� �ʵ� ���� - �ʵ尪 �ʱ�ȭ
	// => �ʵ���� ������ũ ǥ������� �����ϴ� ���� ����
	// => final �����ڸ� ����Ͽ� �ʵ尪 ���� �Ұ����ϵ��� ����
	public static final double INCENTIVE_RATE=1.5;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	/*
	//�޿��� ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	// => �ڽ� Ŭ�������� �������̵� �����ϵ��� �ۼ��� �޼ҵ� - ������ ���� �޼ҵ�
	// => �ڽ� Ŭ�������� �������̵� �������� ������ ȣ�� ����
	public int computePay() {
		return 0;//���ǹ��� ���
	}
	*/

	//�޿��� ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	// => �ڽ� Ŭ�������� ������ �������̵� �����ϵ��� �ۼ��� �޼ҵ� - �߻� �޼ҵ�� ����
	//�߻� �޼ҵ�(Abstract Method) : abstract �����ڷ� ����� �޼ҵ�
	// => ����� �ۼ��ϴ� ������ ���� �ҿ����� �޼ҵ�
	// => �߻� �޼ҵ尡 �ϳ��� ����� Ŭ������ �ݵ�� �߻� Ŭ������ ����
	// => �ڽ� Ŭ�������� �ݵ�� �޼ҵ带 �������̵� �����ϵ��� �������� �����ϴ� �޼ҵ�
	//�߻� �޼ҵ尡 ����� �߻� Ŭ������ ��ӹ��� �ڽ� Ŭ������ ��� �߻� �޼ҵ带
	//�������̵� �����ϰų� �߻� Ŭ������ �����ؾ߸� ���� �̹߻�
	public abstract int computePay();
	
	//�μ�Ƽ�긦 ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	// => ��� ������� �޿��� 150%�� �μ�Ƽ��� ����Ͽ� ����
	//�ڽ� Ŭ�������� �������̵� �����ϸ� ��ȯ�Ǵ� �μ�Ƽ�갡 ���� ����
	// => �ڽ� Ŭ�������� �������̵� �������� ���ϵ��� final �޼ҵ�� ����
	//final �޼ҵ� : �������̵� ������ �� ������ final �����ڷ� �ۼ��� �޼ҵ�
	public final int computeIncentive() {
		//�߻� �޼ҵ带 ȣ���� ��� ������ ��ü ����ȯ�� ���� �ڽ� �ν��Ͻ��� �޼ҵ� ȣ��
		// => �θ� Ŭ������ �޼ҵ忡�� �ڽ� Ŭ������ �޼ҵ� ȣ�� ����
		//int incentive=(int)(computePay()*1.5);
		
		int incentive=(int)(computePay()*INCENTIVE_RATE);
		return incentive;
	}
}












