package Inheritence;

class Parent10{
	void m1()
	{
		System.out.println("m1 parent method");
	}
}
public class Child10 extends Parent10{
	
	void m1()
	{
		System.out.println("m1 child class method");
	}
	
	void m2()
	{
		System.out.println("m2 child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent10 p = new Child10();
		p.m1();
		Child10 c = (Child10)p;
		c.m1();
		c.m2();
	}

}
