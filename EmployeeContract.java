package inheritance;

//����� �������(�����ȣ,����̸�,���޿�)�� �����ϱ� ���� Ŭ����
// => Employee Ŭ������ ��� �޾� �ۼ�
public class EmployeeContract extends Employee {
	private int contractPay;
	
	public EmployeeContract() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeContract(int empNo, String empName, int contractPay) {
		super(empNo, empName);
		this.contractPay = contractPay;
	}

	public int getContractPay() {
		return contractPay;
	}

	public void setContractPay(int contractPay) {
		this.contractPay = contractPay;
	}
	
	//�޿��� ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	/*
	public int returnPay() {
		return contractPay;
	}
	*/

	@Override
	public int computePay() {
		return contractPay;
	}
}




