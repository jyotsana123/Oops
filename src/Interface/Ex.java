package Interface;

interface It
{
	void m1();
	void m2();
	void m3();
}

abstract class Ex1 implements It
{
	public void m1()
	{
		System.out.println("m1 method");
	}
}

abstract class Ex2 extends Ex1
{
	public void m2()
	{
		System.out.println("m2 method");
	}
}

public class Ex extends Ex2{
	
	public void m3()
	{
		System.out.println("m3 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex ex = new Ex();
		ex.m1(); ex.m2(); ex.m3();
	}

}

//If any child class is not implemented completed method of interface then the child class must be abstract
//you need to create multiple child classes to complete the implementation