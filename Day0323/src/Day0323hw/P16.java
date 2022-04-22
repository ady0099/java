package Day0323hw;

public class P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sum = sum +a[0~5];
		
		int sum = 0;
		int[] a= {1, 2, 3, 4, 5, 6};
		
		for (int i =0; i<6; i++)
		{ 
			
			a[i] = i*3;
			
			sum = sum + a[i];
			
			System.out.println(sum);
			//System.out.println(a);
			
		}	
		
			
			
	}

}
