package com.project.demo.service;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileRoute extends RouteBuilder {
	private String path = "C:\\filewatcher\\";
	
	@Override
	public void configure() throws Exception {		
		from("file://"+ path + "input?noop=false")
			.log("${body}")
			.to("file://"+ path + "controle");
	}

}
