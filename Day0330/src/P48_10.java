
public class P48_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {500, 100, 50, 10};
		int money = 523332680;
		
		System.out.println("�Ž������� �� "+ money +"���Դϴ�");
		
		for (int i = 0; i < coin.length; i++)
		{
			int m2 = money / coin[i];
			
			System.out.println(coin[i]+"�� "+m2+"��");
			
			money %= coin[i];
			
			
		}
		System.out.println("�Դϴ�");
			
	}

}
