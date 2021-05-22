	package Dependency;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.context.annotation.Scope;
	import org.springframework.stereotype.Component;
	
	@Component("obja")
	public class A {
		@Autowired
		private B b;
	
		A()
		{
			System.out.println("inside A");
			
		}
	
		public B getB() {
			return b;
		}
	
		public void setB(B b) {
			this.b = b;
			System.out.println("Inside B setter");
		}
	
	
		
		
	
	}
