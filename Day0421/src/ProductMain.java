class Product
{
	int price; // 제품가격
	int bonusPoint; // 보너스 점수
}

class TV extends Product
{
	int channel;
	int volume;
	TV()
	{
		price = 100;
		bonusPoint = 100;
	}
}
class Computer extends Product
{
	int cpu;
	int ram;
	Computer()
	{
		price = 200;
		bonusPoint = 200;
	}
	
}
class Audio extends Product
{
	int volume;
	int speeker;
	Audio()
	{
		price = 50;
		bonusPoint = 50;
	}
}
class Buyer // 물건 사는 사람
{
	int money = 10000; // 소유 금액
	int bonusPoint = 0; //보너스 점수

	void buy(Product p)
	{
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
	}
	void print()
	{
		System.out.println("money = " + money);
		System.out.println("bonusPoint = " + bonusPoint);
	}
}

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Buyer b = new Buyer();
		
		Product[] p = new Product[3];
		p[0] = new TV();
		p[1] = new Computer();
		p[2] = new Audio();
		
		
		
		TV t = new TV();
		b.buy(t);
				
		Product p1 = new TV();
		
//		p1.price;
//		p1.bonusPoint;
//		p1.channel;(x)
//		p1.volume;(x)
		
//		((TV)p1).channel;
		
		TV t10 = (TV)p1;
		System.out.println(t10.channel);
		
//		((TV)p1).volume;
	
		b.buy(p1);
		Product p2 = new Computer();
		
		
				
		for ( int i = 0; i < 3; i++)
		{
			b.buy(p[i]);
		}
		
		b.print();
			
		
	
		
	
	
		Buyer b2 = new Buyer();
		
		Product[] p100 = new Product[4];
		
		p100[0] = new TV();
		p100[1] = new TV();
		p100[2] = new Computer();
		p100[3] = new Audio();
		

				
		for ( int i = 0; i < 4; i++)
		{
			b2.buy(p100[i]);
		}
		b2.print();	
		
		}
	
}




