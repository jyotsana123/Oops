package Interface;

//interface Vs inheritance

interface It2
{
	void m1();
}

interface It3 extends It2
{
	void m2();
}

interface It4 extends It3
{
	void m3();
}

abstract class Ex5 implements It2    //override 1 method
{
	public void m1()
	{
		System.out.println("m1 method");
	}
}

abstract class Ex6 implements It3   //override 2 method
{
	public void m1()
	{
		System.out.println("m1 method");
	}
	
	public void m2()
	{
		System.out.println("m2 method");
	}
	
}
 
public class Ex4 implements It4{         //override 3 method
	
	public void m1()
	{
		System.out.println("m1 method");
	}
	
	public void m2()
	{
		System.out.println("m2 method");
	}
	
	public void m3()
	{
		System.out.println("m3 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//https://www.youtube.com/watch?v=qZWhPSz3u6M&list=PLhChZSBQLZWGrORbbkpPuELxTTAFRoXYP&index=37
