package hi;

public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member();
		//m의 값을 세팅하고 싶음, m.printMember();를 출력하면 null 값이 3번 나옴
		
		//m의 값을 세팅하고 싶음
		//m.name = "안득윤";
		//setter호출
		
		
		
		m.setName("안득윤");
		
		//getter호출
		
		System.out.println(m.getName());
		
		
		m.setTel("010)2533-4433");
		
		System.out.println(m.getTel());
		
		m.setAddress("북부기술교욱원");
		
		System.out.println(m.getAddress());
		
		System.out.println("----------");
		
		m.printMember();
	}

}
