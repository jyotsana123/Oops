package Interface;

interface It11
{
	int a=10; //variables are by default public static and final in interface
	void m1(); // methods are by default public and abstract
}

public class Variables implements It11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variables v = new Variables();
		v.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

}
