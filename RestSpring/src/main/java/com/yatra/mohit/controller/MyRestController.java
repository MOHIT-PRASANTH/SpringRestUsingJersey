package com.yatra.mohit.controller;
import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@Path("/hello") //From JAX-RS
	//@RequestMapping("/hello") From Spring-Web
	public String hello() {
		return "hello";
	}
}