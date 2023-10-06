package com.ecommerce.beans;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class StopEventHandler implements ApplicationListener<ApplicationEvent> {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
        System.out.println("ContextStoppedEvent Received");
		
	}

}
