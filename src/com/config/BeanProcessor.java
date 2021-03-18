package com.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("##### START ######");
		System.out.println(arg0.getClass());
		System.out.println(arg1);
		System.out.println("##### Post Process AFter init ######");
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("##### BEFORE START ######");
		System.out.println(arg0.getClass());
		System.out.println(arg1);
		System.out.println("##### Post Process BEFORE init ######");
		return arg0;
	}

}
