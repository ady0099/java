
public class PracP28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0; 
		String a = "예";
		
		
		for(i =5; i > 0 ; i--)
		{
				System.out.println(a);
		}
		
		for ( i =0; i < 2; i++) //i
		{
			System.out.println("예\t"+i); //"예" +0 \t는 탭만큼 간격
				for( int j = 0; j< 3; j++)
				{
					System.out.println("아니오"+j);
				}
	
		}	
	}

}
