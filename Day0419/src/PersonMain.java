
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//		Person p1 = new Person();
//		p1.setNum(0);;
//		p1.setName("�Ѹ�");
//		p1.setDept("IoT");
//		p1.setAddress("������");
//		Person p2 = new Person(1, "��浿", "IoT", "�����");
//		
//		Student s = new Student();
//		s.setNum(2);
//		s.setName("����");
//		s.setDept("IoT");
//		s.setAddress("��õ��");
//		s.setSubjects(new String[] {"�ڹ�", "���̽�", "HTML"});
		
		Staff st = new Staff("�л�", 4, "��ö��", "IoT", "�����");
				
	}

}

class Person
{
	int num;
	String name;
	String dept;
	String address;
		
	void setNum(int num)
	{
		this.num = num;
	}
	
	int getNum()
	{
		return num;
	}
	
//	Public String getName()
//	{
//		return name;
//	}
//	Public setName(Stirng name)
//	{
//		this.name = name;
//	}
//	
	

Person(int num, String name, String dept, String address)
{
	this.num = num;
	this.name = name;
	this.dept = dept;
	this.address = address;
		
}
Person()
{
		
}
}


class Student extends Person
{
	String[] subjects;
	Student()
	{
		System.out.println("Student()������"+num);
		
	}

	
	void setSubjects(String[] str)
	{
		this.subjects = str;
	}
	
	String[] getSubjects() {
		return subjects;
	}
}

class Professor extends Person
{
	String[] subjects;
	Professor()
	{
		
	}
	
	Professor(String[] subjects, int num, String name, String dept, String address)
	{
		this.subjects = subjects;
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}
	
}

class Staff extends Person
{
	String job;
	int num;
	Staff()
	{
		System.out.println(address);
	}
	Staff(String subjects, int num, String name, String dept, String address)
	{
		//super(num, name, dept, address);
		super();
		super.num=5; //�θ��� num
		this.num=9; //���� num
		//this();
		this.job = job;
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}
	
}






