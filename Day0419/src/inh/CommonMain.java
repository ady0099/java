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
	//TV�� ��ǻ�Ϳ� �������� �����ϴ� �������, ����޼ҵ带 �ϳ��� ProductŬ������
	//�����Ͽ� ���(������ ����)
		
	int no;
	int name;
	
	Product()
	{
		System.out.println("product()1������");
	}
	Product(int no, int name)
	{
		this.no = no;
		this.name = name;
		System.out.println("product()2������"+this.no+"/"+this.name);
	}
			
	void turnOn()
	{
		System.out.println("������ �Ѵ�");
	}
	void turnOff()
	{
		System.out.println("������ ����");
	}
	
	

}

class TV extends Product
{
	int channel; //ä�κ���
	int inch; //ȭ��ũ��
	
	TV()
	{
		System.out.println("TV()1������");
	}
	TV(int channel, int inch, int no, int name)
	{	
		super(no, name); //�θ𿡰� �ߺ��Ǵ� ���� �����ϸ鼭 ������ ȣ��
		this.channel = channel;
		this.inch = inch;
		super.name = 100;
		System.out.println("TV()2������");
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
	int ram; //���� ũ��
	int hdd; //�ϵ� �뷮
	
	void setupBIOS()
	{
		System.out.println("BIOS �¾��ϱ�");
	}

}


//class Tv
//{
//	int no; //��ǰ��ȣ
//	int name; // ��ǰ��
//	int channel; //ä�ι�ȣ
//	int inch; //TVȭ��ũ��
//
//	void turnOn()
//	{
//		System.out.println("������ �Ѵ�");
//	}
//	void turnOff()
//	{
//		System.out.println("������ ����");
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
//	int ram; //���� ũ��
//	int hdd; //�ϵ� �뷮
//	
//	void turnOn()
//	{
//		System.out.println("������ �Ѵ�");
//	}
//	void turnOff()
//	{
//		System.out.println("������ ����");
//	}
//	
//	void setupBIOS()
//	{
//		System.out.println("BIOD�¾��ϱ�");
//	}
//	
//}


//class Tv extends Product
//{
//	int channel; //ä�κ���
//	int inch; //ȭ��ũ��
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
//	int no; //��ǰ��ȣ
//	int name; //��ǰ��
//	
//	void turnOn() {
//		System.out.println("������ �Ѵ�");
//	}
//	
//	void turnOff()
//	{
//		System.out.println("������ ����");
//			}
//}

//	