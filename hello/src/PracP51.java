
public class PracP51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 0;
		String a = "예";
		
		while(i < 5)
		{
			System.out.println(a);
			i++;
		}
		
		int j = 1;
		while(j < 6)
		{ 
			System.out.println("아니오");
			j++;
		}
	
		
		int s = 5;
		while( s > 10)
		{ 
			System.out.println(s);
			s++;
		}
		// 조건을 만족하지 않기 때문에 실행되지 않음
		

		int k = 1;
		do
		{
			 System.out.println(k);
			 k++;
		}while(k<6);
		System.out.println("while 블록 밖에서는 k="+k);
		
		}
		
	}

