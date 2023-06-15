package Abstraction;

abstract class Ex1
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4()
	{
		System.out.println("m4 method");
	}
}

abstract class Ex2 extends Ex1
{
	void m1()
	{
		System.out.println("m1 method");
	}
}

abstract class Ex3 extends Ex2
{
	void m2()
	{
		System.out.println("m2 metod");
	}
}
public class ex extends Ex3{
	void m3()
	{
		System.out.println("m3 method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ex e = new ex();
		e.m1(); e.m2(); e.m3(); e.m4();
	}

}

//Child class has to complete the implementation, If unable to complete the implementation then it must be abstract class
//you can take any no. of child class but you need to make a complete implementation
