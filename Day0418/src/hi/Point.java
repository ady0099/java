package hi;

public class Point {
	private int x;
	int y;
	public void setX(int a) // 다른 클래스에서 x 변수를 사용할 수 있게 setter를 만들어줌
	{
		x = a;
		
	}
	public int getX() { // 다른 클래스에서 x변수의 값을 가져갈 수 있게 getter를 만들어줌
		return x;
	}
	
}
