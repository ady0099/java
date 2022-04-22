
public class Gugudan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = new int[8][9];
				
		for (int i = 0; i<9; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				int mul = (i+1) * (j+2);
				System.out.print(mul+"\t");
			}
			System.out.println();
		}
		
		
	}

}
