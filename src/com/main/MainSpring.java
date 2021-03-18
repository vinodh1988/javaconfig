package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.JavaConfig;

public class MainSpring {
   public static void main(String[] args) {
	 ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfig.class);
	 com.system.Process p=(com.system.Process)ac.getBean("back");
	 p.task();
	 p=(com.system.Process)ac.getBean("ui");
	 p.task();
    }
}
