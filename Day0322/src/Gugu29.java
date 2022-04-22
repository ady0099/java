
public class Gugu29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("2-9단 출력");
		
		int j, k = 0;
		
		for (j=2; j<=9; j++)
			for (k=1; k<=9; k++ )
			{
				if(k!=1)
					{
						System.out.print(j+"*"+k+"="+j*k+"\t");
					}
				
				else if(k==1)
					{
						System.out.println();
						System.out.print(j+"*"+k+"="+j*k+"\t");
				
					}
				
				//풀이 : for (j=1; j<10; j++)
				//		{
				//			for ( k=2; k<10; k++)
				//			{
				//				System.out.print(k+"*"+j+"="+k*j+"\t")
				//			}
				//			System.out.println(); 을 바깥에 입력
					
			}
	}

}
