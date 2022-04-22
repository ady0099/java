
public class P48_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] star =
			{
				{'*', '*', ' ', ' ', ' ', },
				{'*', '*', ' ', ' ', ' ', },
				{'*', '*', '*', '*', '*', },
				{'*', '*', '*', '*', '*', }		
		};
		

		
		for (int i = 0; i < star.length; i++)
		{
			for (int j = 0; j < star[i].length; j++)
			{
				
				System.out.print(star[i][j]+"\t");
			
			}
			System.out.println();
		}
	
	}

}
