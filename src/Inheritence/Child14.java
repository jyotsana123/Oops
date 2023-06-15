package Inheritence;

//https://www.youtube.com/watch?v=aq3sP94Ko5Q&list=PLhChZSBQLZWGrORbbkpPuELxTTAFRoXYP&index=26
//Parent class static block
class Parent14{
	{
		System.out.println("parent instance block");
	}
	
	Parent14()
	{
		System.out.println("Parent class 0-args constructor");
	}
	
	static
	{
		System.out.println("parent class static block");
	}
}
public class Child14 extends Parent14 {
	
	{
		System.out.println("child instance block");
	}
	
	Child14()
	{
		System.out.println("child class 0-args constructor");
	}
	
	static
	{
		System.out.println("child class static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Child14();
		
	}

}
