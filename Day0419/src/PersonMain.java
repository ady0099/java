
public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//		Person p1 = new Person();
//		p1.setNum(0);;
//		p1.setName("둘리");
//		p1.setDept("IoT");
//		p1.setAddress("도봉구");
//		Person p2 = new Person(1, "고길동", "IoT", "노원구");
//		
//		Student s = new Student();
//		s.setNum(2);
//		s.setName("고희동");
//		s.setDept("IoT");
//		s.setAddress("양천구");
//		s.setSubjects(new String[] {"자바", "파이썬", "HTML"});
		
		Staff st = new Staff("학생", 4, "고철수", "IoT", "노원구");
				
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
		System.out.println("Student()생성자"+num);
		
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
		super.num=5; //부모의 num
		this.num=9; //나의 num
		//this();
		this.job = job;
		this.num = num;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}
	
}






