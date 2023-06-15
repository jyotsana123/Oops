package Inheritence;

//https://www.youtube.com/watch?v=aq3sP94Ko5Q
//Parent class Instance block
class Parent11
{
	{
		System.out.println("parent instance block");
	}
}
public class Child11 extends Parent11{
	
	{
		System.out.println("child instance block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Child11();
	}

}
