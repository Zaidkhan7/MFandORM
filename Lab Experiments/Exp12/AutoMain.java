package Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoMain {
	
	public static void main(String args[])
	{
	ApplicationContext context = new ClassPathXmlApplicationContext("Auto.xml");
	A1 a = (A1) context.getBean("A1");
	}

}
