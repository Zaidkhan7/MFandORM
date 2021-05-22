package Dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
	       A a1 = (A)context.getBean("obja");
	       B b1  =(B)context.getBean("objb");
	       a1.setB(b1);
	       b1.setA(a1);
	}
}
