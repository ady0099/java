package hi;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		//p.x=5;
		p.setX(5); 
		//setX()�� public�̶� PointMainŬ�������� ������ �����ϸ�, 
		//�ش� �Լ��� x���� �������ִ� ������ ��
		
		p.y=10;
		System.out.println(p.getX());
		System.out.println(p.y);
	}

}
