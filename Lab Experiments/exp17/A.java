package com.ncu.Maven.BeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("obja")
@Scope("prototype")
public class A {
	
	A()
	{
		System.out.println("In A");
	}
	@PostConstruct
	public void construct()
	{
		System.out.println("bean initialised");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("bean destroyed");
	}
}
