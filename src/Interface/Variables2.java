package Interface;


//if in two interfaces variable name is same and when you try to implement and print those variables the it gives ambiguity problem that both interfaces has same name
interface It12
{
	int a=10; //variables are by default public static and final in interface
}

interface It13
{
	int a=100; //variables are by default public static and final in interface
}

public class Variables2 implements It12, It13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Variables2 v = new Variables2();
		v.m1();
	}

	public void m1() {
		//System.out.println(a);  //if in two interfaces variable name is same and when you try to implement and print those variables the it gives ambiguity problem that both interfaces has same name
		//to overcome the ambiguity problem we can call the variables by interfacename.variablename
		System.out.println(It12.a);
		System.out.println(It13.a);
	}

}
