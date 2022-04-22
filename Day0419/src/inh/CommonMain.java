package inh;

public class CommonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		TV tv2 = new TV(7, 25, 10, 5555);
		
		
		//Computer c = new Computer();
		
//		System.out.println(t.no);
//		System.out.println(t.name);
//		System.out.println(t.inch);
//		System.out.println(t.channel);
//		
//		System.out.println(c.no);
//		System.out.println(c.name);
//		System.out.println(c.hdd);
//		System.out.println(c.ram);
		
	}

}

class Product
{
	//TV와 컴퓨터에 공통으로 존재하는 멤버변수, 멤버메소드를 하나의 Product클래스에
	//정의하여 사용(관리가 쉽다)
		
	int no;
	int name;
	
	Product()
	{
		System.out.println("product()1생성자");
	}
	Product(int no, int name)
	{
		this.no = no;
		this.name = name;
		System.out.println("product()2생성자"+this.no+"/"+this.name);
	}
			
	void turnOn()
	{
		System.out.println("전원을 켜다");
	}
	void turnOff()
	{
		System.out.println("전원을 끄다");
	}
	
	

}

class TV extends Product
{
	int channel; //채널변수
	int inch; //화면크기
	
	TV()
	{
		System.out.println("TV()1생성자");
	}
	TV(int channel, int inch, int no, int name)
	{	
		super(no, name); //부모에게 중복되는 값을 전달하면서 생성자 호출
		this.channel = channel;
		this.inch = inch;
		super.name = 100;
		System.out.println("TV()2생성자");
	}
	
	void ChannelUP()
	{
		channel++;
	}
	
	void ChannelDown()
	{
		channel--;
	}
}
	
class Computer extends Product
{
	int ram; //램의 크기
	int hdd; //하드 용량
	
	void setupBIOS()
	{
		System.out.println("BIOS 셋업하기");
	}

}


//class Tv
//{
//	int no; //제품번호
//	int name; // 제품명
//	int channel; //채널번호
//	int inch; //TV화면크기
//
//	void turnOn()
//	{
//		System.out.println("전원을 켜다");
//	}
//	void turnOff()
//	{
//		System.out.println("전원을 끄다");
//	}
//	void channelUp()
//	{
//		channel++;
//	}
//	void channelDown()
//	{
//		channel--;
//	}
//}
//
//class Computer
//{
//	int no;
//	int name;
//	int ram; //램의 크기
//	int hdd; //하드 용량
//	
//	void turnOn()
//	{
//		System.out.println("전원을 켜다");
//	}
//	void turnOff()
//	{
//		System.out.println("전원을 끄다");
//	}
//	
//	void setupBIOS()
//	{
//		System.out.println("BIOD셋업하기");
//	}
//	
//}


//class Tv extends Product
//{
//	int channel; //채널변수
//	int inch; //화면크기
//	void ChannelUP()
//	{
//		channel++;
//	}
//	
//	void ChannelDown()
//	{
//		channel--;
//	}
//}
//
//
//
//
//

///////

//Tv t = new Tv();
//
//Computer c = new Computer();
//}}
//
//class Product
//{
//	int no; //제품번호
//	int name; //제품명
//	
//	void turnOn() {
//		System.out.println("전원을 켜다");
//	}
//	
//	void turnOff()
//	{
//		System.out.println("전원을 끄다");
//			}
//}

//	