package yy;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person();
		
		Child c = new Child();
		System.out.println(c.hobby);
		//���� ������ ���� ���� ����ӿ��� Person�� ��ӹ޾ұ� ������ ����� �� �ִ�
		System.out.println(c.no);
		System.out.println(c.name);
		
	}

}
class Child extends Person
{
	int hobby;
	
	Child()
	{
	
	}
}


class Person
{
	int no;
	String name;
	
	Person()
	{
		
	}
	
}

