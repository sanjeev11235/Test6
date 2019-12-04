package com.san.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class sanAopExpressions {

	@Pointcut("execution(* com.san.aopdemo.dao.*.*(..))")
	public void forDaoPackage() {}
	
	// create pointcut for getter methods
	@Pointcut("execution(* com.san.aopdemo.dao.*.get*(..))")
	public void  getter() {}
	
	// create pointcut for setter methods
	@Pointcut("execution(* com.san.aopdemo.dao.*.set*(..))")
	public void setter() {}
	
	// crate pointcut: include package... exclude getter/ setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	public void forDaoPackageNoGetterSetter() {}
	
}
