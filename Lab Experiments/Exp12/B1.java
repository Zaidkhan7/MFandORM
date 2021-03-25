package Autowiring;

public class B1 {

	A1 a;
	B1()
	{
		System.out.println("Inside B");
	}

	public A1 getA() {
		return a;
	}

	public void setA(A1 a) {
		
		this.a = a;
	}
	
	
}
