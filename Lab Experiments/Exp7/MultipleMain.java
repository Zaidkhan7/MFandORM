package MultipleInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MultipleMain {
	
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("MultipleInj.xml");
		C c1 = (C)context.getBean("ObjC");
		C c2 =(C)context.getBean("ObjC");
		
	}

}
