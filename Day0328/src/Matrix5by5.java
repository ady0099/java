
public class Matrix5by5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = new int[5][5];
		int i = 0, j= 0, k=0;
		
		matrix[0] = new int[5];
		
		
		for (i = 0; i<5; i++)
		{
			for (j = 0; j< matrix[i].length; j++)
			{
				k = matrix[i][j] = (i+1)*(j+1);
				
				System.out.print(k+"\t");
				
			}
			
			System.out.println();
		}
				
			
		
	}

}
