import java.util.Scanner;

public class Switchbool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		Scanner sc = new Scanner(System.in);
		
		while( true )
		{ 
				System.out.println("멈추려면 1을 입력하라");
				i = sc.nextInt();
				if ( i == 1)
				{
						System.out.println("루프 종료");
						break;
				}
					
				
		}
		System.out.println("루프 수행뒤");
		

	}

}
