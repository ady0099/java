
public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = new int[9][10];
		
		for (int i = 2; i<10; i++)
		{
			for ( int j = 1; j<10; j++)
			{
				int b= a[i-1][j] = i * j;
			
				System.out.print(b+"\t");
				
			}
					
			
		System.out.println();	
		}
		
	}

}
