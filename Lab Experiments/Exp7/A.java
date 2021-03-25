package MultipleInjection;

public class A {
	private B b;
	A()
	{
		System.out.println("In A constructor");
	}
	public B getB() {
		System.out.println("in getter B");
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}

}
