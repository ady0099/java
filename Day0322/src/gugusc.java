import java.util.Scanner;

public class gugusc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.out.print("출력하실 단을 입력하세요");
		Scanner sc=new Scanner(System.in);
			
		int i = 0, j = 1;
		int ans = 0;
		
		i = sc.nextInt();
		
		
		if ( i < 2 || i > 9 )
		{ 
			System.out.println("입력이 잘못되었습니다.");
			
		}
		else
		
			while( i < 10 && j < 10 )
			{	
				ans = i * j;
				System.out.println(i + " * " + j + " = " + ans);
				j++;
			}
		
					
	}

}