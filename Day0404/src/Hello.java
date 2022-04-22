
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = compute(4);
		System.out.println(result);
		
	}

	static int compute(int x)
	{
		int ret = 0;
		
		if ( x == 1)
		{
			ret = 1;
			
		}
		else
		{
			ret = x * (compute(x-1)); // !
		}
		return ret;
		
		// 재귀 메소드 = 메소드 내에서 자신을 호출하는 메소드, 
		// 반복을 구현하기 편하지만 동시에 많은 메소드가 호출되어 스택 메모리 사용량이 크게 늘고 부하를 줄 수 있음
		// 되도록이면 반복문으로 대체
	}
	
}
