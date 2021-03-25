package com.ncu.Maven.SpringDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
//    	CricketCoach Ch=(CricketCoach)ac.getBean("cricketCoach",CricketCoach.class);
    	TennisCoach Tc=(TennisCoach)ac.getBean("tennisCoach",TennisCoach.class);
    	
//    	System.out.println(Ch.getDailyFortune());
    	System.out.println(Tc.getDailyFortune());
    	
    	
    }
}