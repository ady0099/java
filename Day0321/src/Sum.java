
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1���� 100���� ���
		
		int i = 0;
		for(i = 1; i<=100; i++)
		{ 
			System.out.print(i+"\s");
		}
		
		//1���� 10���� ��
		
		System.out.println();
		
		int z = 1;
		int sum = 0;
		
		
		for(z = 1; z<=10; z++)
		{
			sum = sum + z;
			
		}
		System.out.println(sum);
		
		
		//1���� 100���� ��
		int k = 1;
		sum = 0;
		
		for(k = 1; k<=100; k++)
		{
			sum = sum + k;
		}
		System.out.println(sum);
		
		
		//1���� 100���� ¦���� ��
		
		i = 0;
		sum = 0;
		
		for(i = 1; i<=100; i++ )
		{
			if((i%2)==0)
			{
				sum = sum + i;
			}
			
			
		}
		System.out.println(sum);
		
		
		//1-100������ Ȧ��
		//(% ������ �̿�)
		
		
		int j = 0;
		
		for(j = 1; j<=100; j++)
		{
			if(j%2 ==1)
			{
				System.out.print(j+"\t");
			}
			if((j%10)==0)
			{
				System.out.println();
			}
			
		}
		
		
	}

}
