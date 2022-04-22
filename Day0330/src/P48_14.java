
public class P48_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] score = new int[][]{
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}	
		};
		
		int scorelength = score.length;
		int[][] newscore = new int[score.length +1];
		
		int[][] a = new int[6][4];
	
		
		int sum1, sum2, sum3 = 0;
	
				
		for(int i = 0; i < a.length; i++) // score.length =5
		{	
			for(int j=0; j < a[i].length; j++) // 3
			{	
			
				
				a[i][j] = score[i][j];
				
				sum1 = a[0][j];
				sum2 = a[1][j];
				sum3 = a[2][j];
				
				
				
				System.out.print(a+"\t");
			}
			System.out.println();
			
	
		
		}	
	}

}
