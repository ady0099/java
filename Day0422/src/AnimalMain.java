
class Animal
{
	String name;
	
	public void cry()
	{
		System.out.println(name + "�� �Ҹ�����.");
		
	}
}
class Dog extends Animal
{
	public void cry()
	{
		super.cry();
		System.out.println("�۸�");
	}
		public void run()
		{
			System.out.println(name + "�� �ڴ�");
		}
			
}
class Cat extends Animal
{
	public void cry()
	{
		super.cry();
		System.out.println("�߿�");
	}
	public void grooming()
	{
		System.out.println(name + "�� �׷���Ѵ�");
	}
	
}

class AnimalAction
{
	void action(Animal animal)
	{
		animal.cry(); // �ڽ�Ŭ������ cry()����
		if ( animal instanceof Dog)
		{
			((Dog)animal).run();
		}
		else if ( animal instanceof Cat)
		{
			((Cat)animal).grooming();
		}
		else
		{
			System.out.println("Dog, Cat�� ��ü�� �ƴմϴ�.");
		}
	}

}

//void action(Dog d)
//{
//	d.cry();
//	d.run();
//}
//void action(cat c)
//{
//	
//}


public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnimalAction aa = new AnimalAction();
		Animal ani = new Animal();
		ani.name = "ȣ����";
		aa.action(ani);
		
		System.out.println("-----------");
		Animal dog = new Dog(); //upcasting
		dog.name = "������";
		aa.action(dog);
		
		System.out.println("-----------");
		Animal cat = new Cat();
		cat.name = "�����";
		aa.action(cat);
	}

}
