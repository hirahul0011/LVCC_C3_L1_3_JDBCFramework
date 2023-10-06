package com.ecommerce.beans;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener<ApplicationEvent> {
	
	public void onApplicationEvent(ApplicationEvent event) {
	      System.out.println(event.toString());
	   }

}
