package Interface;

interface It5
{
	void m1();
}

interface It6
{
	void m2();
}

interface It7 extends It5, It6    //One interface is able to extends multiple interfaces at a time.
{
	void m3();
}
public class Ex7 implements It7 {

	//override 3 methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

}
