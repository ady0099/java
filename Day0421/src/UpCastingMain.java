
public class UpCastingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("UpCastingParent의 객체");
		UpCastingParent up = new UpCastingParent();
		System.out.println("up.add()="+up.add() + "\n");
		
		System.out.println("UpCastingChild의 객체");
		UpCastingChild uc = new UpCastingChild();
		System.out.println("uc.add()=" + uc.add());
		System.out.println("uc.add()=" + uc.sub() + "\n");
		
		System.out.println("UpCasting된 객체");
		//타입은 부모 클래스, 생성자 호출은 자식클래스 호출
		UpCastingParent upc = new UpCastingChild();
		System.out.println("upc.add()=" +upc.add() + "\n");
		
		UpCastingChild uc2 = (UpCastingChild)upc; // 다운 캐스팅
		System.out.println("up2.sub()=" +(uc2.sub()) + "\n"); //이제 사용 가능
		
//		upc.sub();
	}

}

