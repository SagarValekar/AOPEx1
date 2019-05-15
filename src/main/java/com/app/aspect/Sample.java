package com.app.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Sample {

	@Pointcut("execution(public void *.*.*.*.show(..))")
	public void p1() {};
	
	@Before("p1()")
	public void m1()
	{
		System.out.println("before advice..");
	}
}
