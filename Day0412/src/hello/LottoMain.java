package hello;

// �ζ� ��ȣ �����⸦ ����

// ���� ���� �Ҹ� ���ڸ� ã���ִ� ���α׷��� �ۼ��Ͻÿ�.

//(��, LottoŬ������ �����Ӱ� ���� Ȱ���Ͻÿ�)


public class LottoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//lotto�� ��� ��ȣ�� count�Ѵ�.
		int[] numbersCnt = new int[45];
		
		
		//lotto�� 10�� ����
		
		for ( int i = 0; i < 10; i++)
		{
			Lotto myLotto = new Lotto();
			myLotto.lotto = myLotto.generateNumber();
			for( int j = 0; j < myLotto.lotto.length; j++)
			{
				numbersCnt[myLotto.lotto[j]-1] ++; //= myLotto.lotto[j]; 6���� ��ȣ
				
				
			}
		}
		
		int max = numbersCnt[0];
		int idx = 0;
		for ( int i = 0; i < 45; i++)
		{
			
			if ( numbersCnt[i] > max)
			{
				max = numbersCnt[i];
				idx = i;
			}
			
			
			
		}
		System.out.println("�� ���ڰ�" +max+"�� �ҷȽ��ϴ�.");
	}

}


class Lotto
{
	int[] lotto = new int[6];
	
	int[] generateNumber()
	{
		
		// 0.0*45 <= Math.random()*45 < 1.0*45
		// 0.0+1 <= (int)(Math.random()*45+1) <45.0+1 =>44
		// 1-45
		
		int i = 0;
		while ( i<6)
		{
			int rndNum = (int)(Math.random()*45+1); //1-45������ ��
			boolean isDup = false;
			for ( int j = 0; j < lotto.length; j++)
			{
			
				if ( lotto[j] == rndNum)
				{
					isDup = true;
					break;
				}
			
			}
			//if ( !isDup)
			if ( isDup == false)
			{
				//�ߺ����� ���� ��� lotto�迭�� ä����
				lotto[i] = rndNum;
				i++;
			
			}
		
		
	
			
		}
		return lotto;
		
	}
	
			
			
			
}