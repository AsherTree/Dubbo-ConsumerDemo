package com.asher.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.asher.dubbo.HelloService;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Reference
	private HelloService helloService;
	
	@RequestMapping("/say")
	public String hello() {
		return helloService.sayHello("Bayen");
	}
}
