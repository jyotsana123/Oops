package Inheritence;


//Parent class method
class Parent1{
	public void m1()
	{
		System.out.println("parent class m1 method");
	}
}
public class Child1 extends Parent1 {
	
	public void m1()
	{
		System.out.println("child class m1 method");
	}

	void m2()
	{
		this.m1();
		super.m1();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Child1().m2();
	}

}
