package com.system;

import org.springframework.stereotype.Component;

@Component("bt")
public class BigThread implements SubTask {

	@Override
	public void subTask() {
		// TODO Auto-generated method stub
       System.out.println("Big Thread Started");
	}

}
