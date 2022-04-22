
public class ArrayPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5}; // 5개 짜리 배열.
		int max = 0;
		int sum = 0;
		float avg = 0.0f;
		
		max = makeMax(arr1); // 호출, 함수타입 int, 함수이름 makeMax, 파라미터 1개, 파라미터 타입 int[]
		System.out.print("arr) max = " + max + ",\t");
		
		sum = makeSum(arr1);
		System.out.print("sum = " + sum + ",\t");
		
		avg = makeAvg(arr1);
		System.out.println("avg = " + avg + "\t");
		
		System.out.println("--------------------");
		
		int[] arr2 = {10,20,30,45,48,16,89,77,59,100};
		max = makeMax(arr2);
		System.out.print("arr2) max = " + max + ",\t");
		
		sum = makeSum(arr2);
		System.out.print("sum = " + sum + ",\t");
		
		avg = makeAvg2(arr2);
		System.out.println("avg = " + avg + "\t");
		
		System.out.println("--------------------");
		
		int[] answer = reverse(arr2);
			System.out.print("arr2 reverse) ");
		for(int i=0; i<10; i++) {
			System.out.print(answer[i]+"\t");
		}
		
	
		
	}
	static int makeMax(int[] a) // proto type
	{
		int max = a[0];
		for ( int i = 1; i<a.length; i++)
		{
			if ( max < a[i])
			{
				max = a[i];
				
			}
		}
		return max;
	}
	
	static int makeSum(int[] ab)
	{
		
		int sum = 0;
		for ( int i = 0; i < ab.length; i++)
		{
			sum = sum + ab[i];
		}
		
		return sum;
		
	}
	
	
	static float makeAvg(int[] abc)
	{
		int sum = makeSum(abc);
		float avg = sum/5.0f;
		return avg;
		
		// 평균이니 makeSum을 호출, 변수는 ab가 아닌 makeAvg의 변수인 abc를 사용해야함
			
	}
	static float makeAvg2(int[] abc2)
	{
		int sum = makeSum(abc2);
		float avg = sum/10.0f;
		return avg;
	}
	
	static int[] reverse(int[] arr2)
	{
		int[] arr3 = new int[10]; // = new int[arr2.length]
		
//		arr3[0] = arr2[9];
		
		for (int i = 0; i < arr2.length; i++ )
		{

			arr3[i] = arr2[9-i];	
				
		}
		return arr3;
	}
		
		
	
	
	public static void sub(String[] args) {
		
		int[] arr4 = {10,20,30,45,48,16,89,77,59,100};
		int max = 0;
		int sum = 0;
		float avg = 0.0f;
		
		System.out.println("--");
		
		max = makeMax(arr4);
		System.out.println(max);
		
		sum = makeSum(arr4);
		System.out.println(sum);
		
		avg = makeAvg(arr4);
		System.out.println(avg);
		
		// sub함수도 호출해야 동작함
		
	}
	
	
	
	
	
}
