package com.stackroute.keepnote.aspectj;

import java.util.Date;

import org.aspectj.lang.annotation.Before;

/* Annotate this class with @Aspect and @Component */

public class LoggingAspect {
	/*
	 * Write loggers for each of the methods of Reminder controller, any particular method
	 * will have all the four aspectJ annotation
	 * (@Before, @After, @AfterReturning, @AfterThrowing).
	 */
	@Before("execution(* com.stackroute.keepnote.controller.*.*(..))")
	public void logBefore(){
		System.out.println("@Before:"+new Date());
	}
}
