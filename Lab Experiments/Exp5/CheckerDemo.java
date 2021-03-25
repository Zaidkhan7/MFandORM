package SpringZaid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CheckerDemo {
	public static void main(String args[]) {

	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
	TextEditor te = (TextEditor)context.getBean("Spell");
    te.show();
}
}