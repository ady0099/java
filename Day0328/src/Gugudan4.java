
public class Gugudan4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] num = new int[5][5];
		
		for (int i = 0; i<5; i++)
		{ 
			for (int j=0; j<num[i].length; j++)
			{
				num[i][j] = i*5+j+1;
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
