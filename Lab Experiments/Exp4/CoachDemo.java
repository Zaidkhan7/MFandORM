	package FortuneAndWorkout;
	
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	
	public class CoachDemo {
	
		public static void main(String args[])
		{	
			ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
			RugbyCoach ConstCoach1 = (RugbyCoach)context.getBean("RCoach");
			Cricket ConstCoach2 = (Cricket)context.getBean("myCCoach");
//			Coach Ccoach = (Coach)context.getBean("myCCoach");	
//			Coach Ccoach2 = (Coach)context.getBean("myCCoach");	
//			ConstCoach1.setName("Vinay");
//			ConstCoach2.setName("Zaid");
//
//			
//	System.out.println(ConstCoach1.getName());
//	System.out.println(ConstCoach2.getName());
//			((ClassPathXmlApplicationContext)context).close();
			
			System.out.println(ConstCoach2.getdailyfortune());
			}
		}
	
