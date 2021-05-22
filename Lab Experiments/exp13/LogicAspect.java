package LogicXQ3;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogicAspect {

	@Pointcut("execution(public void logic())")
	private void log() {}
	
	@Around("log()")
	public void Aroundlog(ProceedingJoinPoint jp) throws Throwable
	{
		Long starttime = System.currentTimeMillis();
		jp.proceed();
		Long endtime = System.currentTimeMillis();
		Long duration = endtime-starttime;
		System.out.println(duration+"millisec");
	}
}
