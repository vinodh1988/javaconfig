package com.system;

import org.springframework.beans.factory.annotation.Autowired;

public class BackgroundTask implements Process {

	@Autowired
	   SubTask bt;
	@Autowired
	   SubTask st;
	@Override
	public void task() {
		// TODO Auto-generated method stub
		bt.subTask();
		st.subTask();
       System.out.println("This is a background Task");
	}

}
