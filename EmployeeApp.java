package inheritance;

//��� �޿� ���� ���α׷�
public class EmployeeApp {
	public static void main(String[] args) {
		//�߻� Ŭ������ �ν��Ͻ��� ������ ��� ���� �߻�
		//Employee employee=new Employee();
		
		//�߻� Ŭ����(�θ� Ŭ����)�� ���������� �����Ͽ� �ڽ� Ŭ������ �����ڷ� �ν��Ͻ��� 
		//�����Ͽ� ���� ����
		/*
		Employee employee1=new EmployeeReguler();
		Employee employee2=new EmployeeTime();
		Employee employee3=new EmployeeContract();
		*/
		
		Employee[] empArray=new Employee[5];
		
		empArray[0]=new EmployeeReguler(1000, "ȫ�浿", 96000000);
		empArray[1]=new EmployeeTime(2000, "�Ӳ���", 50000, 150);
		empArray[2]=new EmployeeContract(3000, "����ġ", 7000000);
		empArray[3]=new EmployeeTime(4000, "������", 10000, 100);
		empArray[4]=new EmployeeReguler(5000, "����", 60000000);
		
		for(Employee emp:empArray) {
			System.out.println("�����ȣ = "+emp.getEmpNo());
			System.out.println("����̸� = "+emp.getEmpName());
			
			//����� �޿��� ��ȯ�޾� ���
			/*
			// => ����� ��ü ����ȯ�� �̿��Ͽ� �ڽ� �ν��Ͻ��� �޼ҵ� ȣ��
			// => instanceof �����ڸ� �̿��Ͽ� �ڽ� �ν��Ͻ��� �����Ͽ� ��ü ����ȯ
			if(emp instanceof EmployeeReguler) {
				System.out.println("����޿� = "+((EmployeeReguler)emp).computeSalary());
			} else if(emp instanceof EmployeeTime) {
				System.out.println("����޿� = "+((EmployeeTime)emp).calcPay());
			} else if(emp instanceof EmployeeContract) {
				System.out.println("����޿� = "+((EmployeeContract)emp).returnPay());
			}
			*/
			
			//�޼ҵ� �������̵带 �̿��Ͽ� ������ ��ü ����ȯ���� �ڽ� �ν��Ͻ��� �޼ҵ� ȣ��
			System.out.println("����޿� = "+emp.computePay());

			System.out.println("�μ�Ƽ�� = "+emp.computeIncentive());
			System.out.println("=======================================================");
		}
	}
}





