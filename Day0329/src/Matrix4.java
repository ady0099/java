
public class Matrix4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = new int[5][5];
		
		int i = 0;
		int j = 0;
		
		for ( i = 0; i<5; i++)
		{	
			
			for(j=0; j<i+1; j++)
			{
				a[i][j] = j;
				System.out.print(a[i][j]+"\t");
				
			}
			System.out.println();
		}
			
	}
}