
public class SutdaCardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		SutdaCard card1 = new SutdaCard(3, false);
//		SutdaCard card2 = new SutdaCard();
//		
		SutdaCard s = new SutdaCard();
		SutdaCard ss = new SutdaCard();
		//System.out.println(s.ran()+ss.TF());
	}

}

class SutdaCard{
	
	int x;
	boolean t;
	
	int ran(int a)
	{
		int rx = 0;
		
		rx = (int)(Math.random()*12+1);
		
		return rx;
		
	}
	
	boolean TF(boolean b)
	{
		int rx = 0;
		boolean tt = true;
		
		rx = (int)(Math.random()*12+1);
		
		if ( rx % 2 == 0)
		{
			tt = true;
		}
		if ( rx % 2 == 1)
		{
			tt = false;
		}
		else
		{
			tt = true;
		}
		return tt;
	}
	
	
	SutdaCard()
	{
	
	}
	
	
	SutdaCard(int a, boolean b)
	{
		x = ran(a);
		t = TF(b);
			
	}	
	
	//void 
	
	
	
	
}