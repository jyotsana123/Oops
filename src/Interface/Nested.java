package Interface;

//Nested Interface
interface It8
{
	interface It9
	{
		void m1();
	}
}
public class Nested implements It8.It9 {   //map.entry  is nested interface in map collection

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Nested n = new Nested();
		n.m1();
	}

	@Override
	public void m1() {
		System.out.println("m1 method");
		
	}

}
