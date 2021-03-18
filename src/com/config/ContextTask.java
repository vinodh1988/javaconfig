package com.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class ContextTask implements ApplicationContextAware {

	@Override
	public void setApplicationContext(ApplicationContext ac) throws BeansException {
		// TODO Auto-generated method stub

	   System.out.println("------------------------------------------");
	   System.out.println("Startup logic - app context is set");
	   //System.out.println(ac.getDisplayName());
	   System.out.println("------------------------------------------");
	}

}
