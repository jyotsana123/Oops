package Inheritence;

//Parent class constructors
class Parent5
{
	Parent5(int a) //if any constructor is declared then compiler is not generating default constructor
	{
		System.out.println("parent class 1-args constructor");
	}
}
public class Child5 extends Parent5{
	
	Child5()
	{
		//super();  //it's giving error, because 1 args constructor declared in parent class. if any arugument constructor available then 0 args constructor not called
		super(10);
		System.out.println("0-args child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		new Child5();
	}

}
