package hi;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member();
		//m�� ���� �����ϰ� ����, m.printMember();�� ����ϸ� null ���� 3�� ����
		
		//m�� ���� �����ϰ� ����
		//m.name = "�ȵ���";
		//setterȣ��
		
		
		
		m.setName("�ȵ���");
		
		//getterȣ��
		
		System.out.println(m.getName());
		
		
		m.setTel("010)2533-4433");
		
		System.out.println(m.getTel());
		
		m.setAddress("�Ϻα�������");
		
		System.out.println(m.getAddress());
		
		System.out.println("----------");
		
		m.printMember();
	}

}
