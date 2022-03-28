
public class Gugudan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = new int[9][8];
	
		for (int i = 0; i<9; i++)
		{
			int s = i+1;
					
			for ( int j = 0; j<8; j++)
			{	
				int t = j+2;
				
				int b = a[i][j] = s * t;
			
			System.out.print(b+"\t");
			}
		
		System.out.println();		
		}		
				
				
	}

}
