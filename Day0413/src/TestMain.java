
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 멤버변수 int total
		// 멤버 메소드 sum() 함수는 int 1차원 배열을 인자로 받으며 
		// 해당 배열의 값들을 모두 더하는 일을 하며. 모두 더한 값을 돌려준다
		// TestMain 클래스를 만들어 Test 클래스의 sum() 호출하여 값을 프린트
		
		Test arr=new Test();
		int[] total = {9, 34, 23, 34, 8, 1, 99, 98, 66};
		System.out.println(arr.sum(total));
		
	}

}

class Test{
	int total;
	
	int sum(int[] a) {
		int sum = 0;
		for ( int i = 0; i<a.length; i++)
		{
			sum = sum+a[i];
		}
		return sum;
		
	}
	
}