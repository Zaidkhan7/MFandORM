package Autowiring;

public class C1 {
 
	A1 a;

	C1()
	{
		System.out.println("Inside C");
	}
	public A1 getA() {
		return a;
	}

	public void setA(A1 a) {
		System.out.println("Setting A in C ");
		this.a = a;
	}
}
