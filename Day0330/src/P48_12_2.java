
public class P48_12_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] star =
			{
				{'*', '*', ' ', ' ', ' ', },
				{'*', '*', ' ', ' ', ' ', },
				{'*', '*', '*', '*', '*', },
				{'*', '*', '*', '*', '*', }		
		};
//		
//		star[4][5] = newStar[5][4];
//		
//		star[i][j] = newStar[j][star.length-1-i]

		int[][] a = new int[5][5];
		for (int i = 0; i <5; i++)
		{
			for ( int j = 0; j<5; j++)
			{
				
				       //   a[i][j] = 
				
				// �迭�� ���� �ִ� �۾����ϴ� for��
			}
		}
		
		for (int i = 0; i<5; i++)
		{
			for (int j = 0; j<5; j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
//		for (int i = 0; i < star.length; i++)
//		{
//			for (int j = 0; j < star[i].length; j++)
//			{
//				
//				System.out.print(star[i][j]+"\t");
//			
//			}
//			System.out.println();
		
	
	}//main()�� ������ ������ ����Ʈ �Լ��� ��������
	
	void print(int[][] a)
	{
		for(int i = 0;i<5; i++)
		{
			for (int j = 0; j<5; j++)
			{
				System.out.println( a[i][j]);
			}
				
		}
		
	}
}

