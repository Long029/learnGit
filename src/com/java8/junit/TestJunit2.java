package com.java8.junit;

import org.junit.Test;

import junit.framework.TestResult;

public class TestJunit2 extends TestResult{
	
	public synchronized void addErr(Test test, Throwable t){
		this.addError((TestJunit) test, t);
	}
	
	public synchronized void addFailure(Test test, Throwable t){
		this.addFailure(test, t);
	}
}
