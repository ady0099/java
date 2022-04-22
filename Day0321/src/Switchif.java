
public class Switchif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu=85;
		if ( jumsu >= 90)
		{
				System.out.println("수");
				
		}
		
		else if ( jumsu >= 80)
		{
				System.out.println("우");
		}
		
		else
		{
				System.out.println("가");
		}
		
		System.out.println("\n----------\n");
		
		
		int jumsus = 85;
		switch ( jumsus )
		{
		case 80 :
		case 81 : case 82 : case 83 : case 84 : case 85 : case 86 : case 87 : case 88 : case 89 : 
			System.out.println("우");
			break;
		
		case 90 :
			System.out.println("수");
			break;
				
		case 91 :
			System.out.println("수");
			break;
		
		case 92 :
			System.out.println("수");
			break;
			
		case 93 :
			System.out.println("수");
			break;
		
		case 94 :
			System.out.println("수");
			break;
		
		case 95 :
			System.out.println("수");
			break;	
		
		case 96 :
			System.out.println("수");
			break;	
			
		case 97 :
			System.out.println("수");
			break;	
			
		case 98 :
			System.out.println("수");
			break;
			
		case 99 :
			System.out.println("수");
			break;	
			
		case 100 :
			System.out.println("수");
			break;	
		
			
			
		default:
			System.out.println("가");
			break;
		
		}
		
		
		
	}

}
