package Abstraction;

abstract class Parent
{
	abstract void m1();
	abstract void m2();
	void m3() {
		System.out.println("m3 method");
	}
}

abstract class Parent1 extends Parent
{
	void m1()
	{
		System.out.println("m1 method");
	}
}
public class Child extends Parent1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		
	}

}
