package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.system.BackgroundTask;
import com.system.UITask;

@Configuration
@ComponentScan(basePackages="com.system")
public class JavaConfig {

	 
	@Bean(name="back")
	@Scope("prototype")
	public com.system.Process getBackground() {
		return new BackgroundTask();
	}
	
	@Bean(name="ui")
	
	public com.system.Process getUI() {
		return new UITask();
	}
}
