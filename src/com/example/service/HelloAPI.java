package com.example.service;

import com.example.entity.Hello;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;

@Api(name="helloapi",version="v1", description="An API to say hello")
public class HelloAPI {
	
	//@ApiMethod(name="display")
//	public Hello displayHello() {
		//Hello h = new Hello();
	//	h.Text = "SHOW";
	//	return h;
//	}
	
	@ApiMethod(name="showString")
	public Hello showString(@Named("Hello World") String hello) {		
		Hello h = new Hello();
		h.Text = "Hello world";
		return h;
		
	}
	public class Hello {
	public String Text;
	 
	}
}

//}
