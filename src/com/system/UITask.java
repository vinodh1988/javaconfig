package com.system;

import org.springframework.beans.factory.annotation.Autowired;

public class UITask implements Process {
	{
		System.out.println("UI Task is instantiated");
	}
@Autowired
  SubTask st;
	@Override
	public void task() {
		// TODO Auto-generated method stub
		st.subTask();
         System.out.println("This is UI Task");
	}

}
