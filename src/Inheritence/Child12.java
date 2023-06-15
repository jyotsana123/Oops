package Inheritence;

//https://www.youtube.com/watch?v=aq3sP94Ko5Q
//Parent class Instance block
class Parent12
{
	Parent12()
	{
		System.out.println("parent class 0-args constructor");
	}
	
	{
		System.out.println("parent instance block");
	}
}
public class Child12 extends Parent12{
	
	Child12()
	{
		System.out.println("parent class 0-args constructor");
	}
	
	{
		System.out.println("child instance block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Child12();
	}

}
