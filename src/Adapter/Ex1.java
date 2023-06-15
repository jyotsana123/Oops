package Adapter;

public class Ex1 extends Ex{
	
	public void m1()
	{
		System.out.println("m1 method");
	}
	
	public void m2()
	{
		System.out.println("m2 method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex ex = new Ex1();
		ex.m1();
		ex.m2();
		//ex.m3();
	}

}

//Adapter class contains empty implementation of interface methods, then you need to extends adapter class in other class and use 2 required methods.
