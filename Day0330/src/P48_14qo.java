import java.util.Arrays;

public class P48_14qo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "A", "B", "C" };
		int arrLength = arr.length;
		// ���� �迭�� ���ο� �迭�� ����(���̸� �÷���)
		String[] newArr = new String[arrLength + 1];
		for (int i = 0; i < arrLength; i++) {
		newArr[i] = arr[i];
		}
		// ���� �þ index�� �� �߰�
		newArr[arrLength] = "D";
		// ��� ���
		System.out.println("���� �迭 : " + Arrays.toString(arr));
		System.out.println("���ο� �迭 : " + Arrays.toString(newArr));

		
		
	}

}
