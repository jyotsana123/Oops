package Abstraction;

abstract class Parent2   //Abstract method can have any return type & any no. of arguments.
{
	abstract int m1(char a, int b);
	abstract float m2(boolean b);
	abstract String login(String uname, String upwd);
	//write the implementation in two child class
}

abstract class Parent3 extends Parent2
{
	int m1(char a, int b)
	{
		System.out.println("m1 method");
		return 10;
	}
	
     float m2(boolean b)
	{
		System.out.println("m2 method");
		return 10.5f;
	}
}

class Parent4 extends Parent3
{

	@Override
	String login(String uname, String upwd) {
		// TODO Auto-generated method stub
		System.out.println("login");
		return "hello";
	}
	
}

public class Child1 extends Parent4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1 ch = new Child1();
		ch.m1('a', 5);
	}

}

//Abstract method can have any return type & any no. of arguments.