
class UpCastingParent {

		protected int x;
		protected int y;
		UpCastingParent()
		{
				x = 10;
				y = 20;
		}
		int add()
		{
			System.out.println("parent add()");
			return x+y;
		}
		
		
}



class UpCastingChild extends UpCastingParent
{
	private int z;
	
	public UpCastingChild()
	{
		x = 100;
		y = 200;
		z = 300;
		
	}
	public int add()
	{
		
		System.out.println("childÀÇ add()");
		return x + y + z;
		
	}
	public int sub()
	{
		System.out.println("childÀÇ sub()");
		return x-y-z;
	}
	public int getZ()
	{
		return z;
	}
	public void setZ(int z)
	{
		this.z = z;
		
	}
}
