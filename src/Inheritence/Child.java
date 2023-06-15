package Inheritence;
//https://www.youtube.com/watch?v=zpDttg6Y3b8&list=PLhChZSBQLZWGrORbbkpPuELxTTAFRoXYP&index=24

//Parent class variable
class Parent
{
	int a = 10,b=20;
}

public class Child extends Parent {
	int a = 100,b=200;
	
	void add(int a, int b)
	{
		System.out.println(a+b);
		System.out.println(this.a+this.b);
		System.out.println(super.a+super.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Child().add(1000, 2000);
	}

}
