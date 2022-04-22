package Day0323hw;

public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// num[1]= 10; num[2] = 100; num[3] = 1000; num[4] = 10000;
		
		int i = 0;
		int[] num = new int[] {1, 1, 1, 1, 1};
		int j = 1;
		
		for(i = 1; i <=4; i++)
			
			{
			j = j*10;
			System.out.println("num["+ i +"] = "+ j + ";"); 
			}
	
//			double a = Math.pow(10, i);
//			
//			num[i] = a;
//			double b = Math.round(a);
			
			//System.out.println("num["+ i +"]"+" = "+ a);
					
	
		
		
	}

}
