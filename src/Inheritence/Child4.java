package Inheritence;

//Parent class constructor
class Parent4
{
	
	Parent4(int a)
	{
		System.out.println("parent class 1-args constructor");
	}
}
public class Child4 extends Parent4{
	
	Child4()
	{
		super(10);
		System.out.println("0-args child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		new Child4();
	}

}
