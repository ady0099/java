package hi;

public class Member {
	private String name;
	private String tel;
	private String address;
	
	void printMember()
	{
		System.out.println(name);
		System.out.println(tel);
		System.out.println(address);
	}
	
	//setter
	void setName(String name)
	{
		this.name = name;
		//set은 돌려줄 것이 없기 때문에 모두 void, 매개변수는 항상 있음
	}
	//getter
	
	String getName()
	{
		return name;
		//get은 얻어가기 때문에 함수타입이 필요, 파라미터는 무조건 없음, return 필요
	}
	
	void setTel(String tel){
		this.tel = tel;
	}
	
	String getTel()
	{
		return tel;
	}
	
	void setAddress(String address) {
		this.address = address;
	}
	
	String getAddress()
	{
		return address;
	}
}
