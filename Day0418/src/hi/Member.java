package hi;

public class Member {
	private String name;
	private String tel;
	private String address;
	
	void printMember()
	{
		System.out.println(name);
		System.out.println(tel);
		System.out.println(address);
	}
	
	//setter
	void setName(String name)
	{
		this.name = name;
		//set�� ������ ���� ���� ������ ��� void, �Ű������� �׻� ����
	}
	//getter
	
	String getName()
	{
		return name;
		//get�� ���� ������ �Լ�Ÿ���� �ʿ�, �Ķ���ʹ� ������ ����, return �ʿ�
	}
	
	void setTel(String tel){
		this.tel = tel;
	}
	
	String getTel()
	{
		return tel;
	}
	
	void setAddress(String address) {
		this.address = address;
	}
	
	String getAddress()
	{
		return address;
	}
}
