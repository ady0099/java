import java.util.Arrays;

public class P48_14qo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "A", "B", "C" };
		int arrLength = arr.length;
		// 기존 배열을 새로운 배열로 복사(길이를 늘려줌)
		String[] newArr = new String[arrLength + 1];
		for (int i = 0; i < arrLength; i++) {
		newArr[i] = arr[i];
		}
		// 새로 늘어난 index에 값 추가
		newArr[arrLength] = "D";
		// 결과 출력
		System.out.println("기존 배열 : " + Arrays.toString(arr));
		System.out.println("새로운 배열 : " + Arrays.toString(newArr));

		
		
	}

}
