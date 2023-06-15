package Inheritence;

//Parent class constructor
class Parent3
{
	//default constructor parent
	//{
		//Empty implementation
	//}
}
public class Child3 extends Parent3{
	
	Child3()
	{
		super();  //it's not giving any error, if doesn't declare any constructor in parent class then default constructor will called by compiler
		System.out.println("0-args child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		new Child3();
	}

}
