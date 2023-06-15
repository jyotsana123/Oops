package Adapter;

public interface It1 {
	void m1();
	void m2();
	void m3();
	void m4();
	void m5();
	void m6();
	void m7();
	void m8();
	void m9();
	void m10();
}


/*suppose you want to use only 2 methods of interface out of 10 methods then you need to use the adapter class concept.
* Adapter class contains empty implementation of interface methods, then you need to extends adapter class in other class and use 2 required methods.
* Adapter Class is a simple java class that implements an interface with only an empty implementation.
*/