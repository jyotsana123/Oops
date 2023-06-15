package Interface;

interface It1
{
	void m1();
	void m2();
	void m3();
}
public class Test implements It1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test = new Test();
		test.m1();test.m2();test.m3();
		
		It1 i = new Test();  //you can create reference of interfaces which holds child class object
		i.m1(); i.m2(); i.m3();
	}

	@Override
	public
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 method");
	}

}

//By inheriting the interface you can not reduce the access permission of the methods, Interface methods are 
//public and abstract by default, so in child access modifiers should be public as well.
