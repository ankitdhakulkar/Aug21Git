
//declare local and global variable

package Git_Package;

public class variable1 {
	static int a=10;
	int b=20;
	

	public static void main(String[] args) {
		
		demo();
		
		variable1 ob=new variable1();	
		ob.demo1();
		
		System.out.println(a);
		System.out.println("value od b is "+ob.b);
	}
	
	public static void demo()
	{
	

		//int a= 15;
		int b=15;
		int sum=a+b;
		System.out.println("sum of two number is "+sum);
	}

	public void demo1()
	{
		System.out.println("value of b is "+b);
		int sub=b-a;
		System.out.println("substraction of two number is "+sub);
	}
}
