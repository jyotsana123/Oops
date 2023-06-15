package Inheritence;

//Parent class constructor
class Parent6
{
	Parent6()
	{
		System.out.println("0-args parent class constructor");
	}
}
public class Child6 extends Parent6{
	
	Child6()
	{
		//in any constructor if you are not writing this and super keyword then compiler generate super keyword
		//at first line of the constructor.
		//if compiler generate super keyword the 0-args constructor calling of parent class.
		//that is why in o/p parent class constructor also printing.
		System.out.println("0-args child class constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		new Child6();
	}

}
