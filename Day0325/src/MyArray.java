
public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//int[][] stu;
//		//stu = new int[2][];
//		//stu[0] = new int[3];
//		stu[1] = new int[3];
//		stu[0][0] = 100;
//		stu[0][1] = 50;
//		stu[0][2] = 20;
//		
//		int[][] stu = new int[2][3];
		
		int[][] stu = {
						{100, 50, 20},//행
						{10, 40, 80}//열
					};
		//= 90;
			
		//키, 신발사이즈, 형제수
		//a 10개
		//int[] a = new int[10];
		
		//a[9] = 10;
		
		//int[][] a = new int[10][3];
//		a[0][0] = 100;
//		a[0][1] = 50;
//		a[0][2] = 20;
//		
//		a[1][0] = 10;
//		a[1][1] = 40;
//		a[1][2] = 80;
//		
//		a[1][1] = 90;
		
		//a[0][0] = 0;
		//a[0][1] = 1;
		//a[0][2] = 2;
		
		//for 사용.
		//for, i, i
		
		//배열 2차원 사용해서 값 담기
		// a p p l e
		// l e m o n
		
		
		int[][] a = new int[10][3];
		
		for ( int i = 0; i<10; i++)
		{
			for(int j =0; j<3; j++)
			{
				a[i][j] = j;
				
			}
		}
		
		System.out.println(a[0][2]);
		System.out.println(a.length);
		
	}

}
