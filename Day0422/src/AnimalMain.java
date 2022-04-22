
class Animal
{
	String name;
	
	public void cry()
	{
		System.out.println(name + "가 소리낸다.");
		
	}
}
class Dog extends Animal
{
	public void cry()
	{
		super.cry();
		System.out.println("멍멍");
	}
		public void run()
		{
			System.out.println(name + "가 뛴다");
		}
			
}
class Cat extends Animal
{
	public void cry()
	{
		super.cry();
		System.out.println("야옹");
	}
	public void grooming()
	{
		System.out.println(name + "가 그루밍한다");
	}
	
}

class AnimalAction
{
	void action(Animal animal)
	{
		animal.cry(); // 자식클래스의 cry()동작
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
			System.out.println("Dog, Cat의 객체가 아닙니다.");
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
		ani.name = "호랑이";
		aa.action(ani);
		
		System.out.println("-----------");
		Animal dog = new Dog(); //upcasting
		dog.name = "강아지";
		aa.action(dog);
		
		System.out.println("-----------");
		Animal cat = new Cat();
		cat.name = "고양이";
		aa.action(cat);
	}

}
