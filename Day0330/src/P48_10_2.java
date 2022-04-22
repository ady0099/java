
public class P48_10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] coin = {500, 100, 50, 10};
		int money = 2680;
//		
		int[][] data = new int[4][2];
		
		for (int i = 0; i < data.length; i++)
		{
			data[i][1] = money/data[i][0];
			
			
			money %= data[i][0];
			
			
			System.out.println(data[i][0]+"¿ø "+data[i][1]+"°³");
			
		}	
	}

}
