package LogicXQ3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import EmployeeAOP.Configure;

public class MainApp {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigureLogic.class);
		Logicx log = (Logicx)context.getBean("logic");
		log.logic();

	}

}
