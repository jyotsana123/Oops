package Inheritence;

//parent class Instance block
class Parent13{
	{
		System.out.println("parent instance block");
	}
}
public class Child13 extends Parent13 {
	
	{
		System.out.println("child instance block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Child13();
		new Child13();
	}

}
