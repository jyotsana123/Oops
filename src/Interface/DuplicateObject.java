package Interface;

public class DuplicateObject implements Cloneable{
	
	int a = 10;
	int b = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DuplicateObject d = new DuplicateObject();
		System.out.println(d.a);
		System.out.println(d.b);
		DuplicateObject d1 = (DuplicateObject)d.clone(); //create duplicate object by clone method
		d.a=30;
		d.b=40;
		System.out.println(d.a);
		System.out.println(d.b);
		//here I want to print 10, 20
		//DuplicateObject d1 = (DuplicateObject)d.clone();
		System.out.println(d1.a);
		System.out.println(d1.b);
		
	}

}
