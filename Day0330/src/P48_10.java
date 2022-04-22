
public class P48_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = {500, 100, 50, 10};
		int money = 523332680;
		
		System.out.println("거스름돈은 총 "+ money +"원입니다");
		
		for (int i = 0; i < coin.length; i++)
		{
			int m2 = money / coin[i];
			
			System.out.println(coin[i]+"원 "+m2+"개");
			
			money %= coin[i];
			
			
		}
		System.out.println("입니다");
			
	}

}
