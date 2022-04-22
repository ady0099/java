package student;

public class Student {

	
	private String major;
	private String id;
	
	
	void printStudent(){
		System.out.println(major);
		System.out.println(id);
	}
	
	
	void setMajor(String major)
	{
		
		this.major = major;
	}
	
	void setId(String id) {
		
		this.id = id;
	
		
	}
	
	String getMajor(){
		
		return major;
		
	}
	
	String getId() {
		
		return id;
	}
	
}
