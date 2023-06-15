package Inheritence;

//https://www.youtube.com/watch?v=O5CqLpzn5_c&list=PLhChZSBQLZWGrORbbkpPuELxTTAFRoXYP&index=25
//Parent class constructor
class Parent2
{
	Parent2()
	{
		System.out.println("parent class 0-args constructor");
	}
	
	
}
public class Child2 extends Parent2 {
	
	Child2()
	{
		this(10);  //both this and super at a time is not possible
		//super();
		System.out.println("child class 0-args constructor");
	}
	
	Child2(int a)
	{
		super(); //super keyword must be first statement inside the constructor
		System.out.println("child class 1-args constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Child2();
	}

}
