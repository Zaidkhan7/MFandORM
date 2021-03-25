package MultipleInjection;

public class C {
	private A a;
	C()
	{
		System.out.println("In C constructor");
	}
	public A getA() {
		System.out.println("In getter A");
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}

}
