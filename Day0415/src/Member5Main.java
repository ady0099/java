class Member5{
	
String name;
String tel;
String address;

Member5(){
	this("no name");
	System.out.println("�Ķ���;��� �������� this() ��");


}

Member5(String name){
	this("test", "222", "����");
	System.out.println("�Ķ���� 1�� ���� �������� this() ��");
	System.out.println("���� ���� �Ķ���� : " + name);
}

Member5(String name, String tel, String address){
	System.out.println("�Ķ���� 3���� ���� ������ ȣ���");
	this.name = name;
	this.tel = tel;
	this.address = address;
	
	
}

void print() {
	System.out.println("name : " + name);
	System.out.println("tel : " + tel);
	System.out.println("address : " + address);
	
}

}


public class Member5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member5 m = new Member5();
		m.print();
		
	}

}

