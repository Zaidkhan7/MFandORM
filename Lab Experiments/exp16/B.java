package Dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("objb")
public class B {
	
	@Autowired
	private A a;
	
	B(){
		System.out.println("inside B");
		
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
		System.out.println("Inside A setter");
	}

	
	
}
