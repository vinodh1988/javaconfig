package com.system;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;


@Component("bt")
public class BigThread implements SubTask,InitializingBean,DisposableBean{

	{
		System.out.println("BT Thread is instantiated");
	}
	
	BigThread(){
		System.out.println("Big Thread Constructor");
	}
	
	@PostConstruct
	public void init() {
	  System.out.println("Big Thread Post Constructor logic");	
	}
	@Override
	public void subTask() {
		// TODO Auto-generated method stub
       System.out.println("Big Thread Started");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Big Thread Disposed");
	}
    
	@PreDestroy
	public void predestroy() {
	  System.out.println("Big Thread PreDestroy logic");	
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Big Thread Initialized");
	}

}
