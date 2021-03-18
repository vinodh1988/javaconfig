package com.system;

import org.springframework.stereotype.Component;

@Component("st")
public class SimpleThread implements SubTask {

	{
		System.out.println("ST thread is instantiated");
	}
	@Override
	public void subTask() {
		// TODO Auto-generated method stub
            System.out.println("Simple Thread Started Executing");
	}

}
