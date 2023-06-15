package Abstraction;

abstract class Test1
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4()
	{
		System.out.println("m4 method");
	}
	
}
public class Test extends Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Test1 test = new Test1(); compilation error: Test1 is abstract, Can not be instantiated
		Test test = new Test(); //you can create object for normal class
		test.m1(); test.m2(); test.m3(); test.m4();
		
		//Parent p = new child();
		Test1 t1 = new Test();  //The abstract class hold child class object
		t1.m1(); t1.m2(); t1.m3(); t1.m4();
		
	}

	@Override
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");
	}

	@Override
	void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 method");
	}

}
