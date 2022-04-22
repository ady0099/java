
public class Matrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[5][5];
		
		int i = 0;
		int j = 0;
		
		for ( i = 0; i < 5; i++)
		{		
			
			for ( j = 0; j < a.length; j++)
			{
				int mat = (i+1)+(j*5);
				System.out.print(mat+"\t");
					
				
			}
			
			
		System.out.println();
		}
		
		
	}

}
