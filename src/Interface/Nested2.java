package Interface;

//It is possible to declare interface inside the class
class A
{
	interface It10
	{
		void m1();
	}
}
public class Nested2 implements A.It10 {   //map.entry  is nested interface in map collection

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nested2 n = new Nested2();
		n.m1();
	}

	@Override
	public void m1() {
		System.out.println("xxx m1 method");
		
	}

}
