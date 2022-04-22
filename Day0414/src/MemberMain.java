
public class MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m1 = new Member();
		m1.print();
		System.out.println();
		
		Member m2 = new Member("¾ÆÀÌÀ¯");
		m2.print();
		System.out.println();
		
		Member m3 = new Member("±è¸»¼÷", "010-9999-8888", "´ëÇÑ¹Î±¹");
		m3.print();
		System.out.println();
		
		
		
		
		Member m2_5 = new Member("¿øºó", "010-4483-6625");
		m2_5.print();
		
	}

}


class Member{
	String name;
	String tel;
	String address;
	
	Member(){
		name = "no name";
		tel = "no tel";
		address = "no address";
	}
	
	Member(String _name){
		name = _name;
		tel = "no tel";
		address = "no address";
	}
	
	Member(String name, String tel, String address){
// 	Member(String _name, String _tel, String _address){		
//		name = _name;
//		tel = _tel;
//		address = _address;
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	Member(String _name, String _tel)
	{
		name = _name;
		tel = _tel;
		address = "no address";
	}
	
	
	
	void print()
	{
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
	
}

