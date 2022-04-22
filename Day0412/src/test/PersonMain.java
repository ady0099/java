package test;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person hong = new Person();
		hong.input("È«±æµ¿", 20, "¼­¿ï");
		Person.countPerson++;
		Person.print();
		
		Person lee = new Person();
		lee.input("ÀÌ¸ù·æ", 30, "Á¦Ãµ");
		Person.countPerson++;
		hong.print();
		
		Person sung = new Person();
		sung.input("¼ºÃáÇâ", 40, "ÀÎÃµ");
		Person.countPerson++;
		Person.print();
		
		hong.printInstance();
		
		Person.print();
		hong.print();
		
		
	}

}


class Person
{
	static int countPerson;
	String name;
	int age;
	String address;
	
	void input(String _name, int _age, String _address)
	{
		name = _name;
		age = _age;
		address = _address;
	}
	static void print()
	{
		System.out.println(countPerson);
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(address);
//		printInstance();
		
	}
	
	void printInstance()
	{
		
		System.out.println(name);
	}
}
