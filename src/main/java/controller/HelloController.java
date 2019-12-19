package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * 基于SSM框架的第一个控制器
 * jdk8
 * 
 * 1.添加@Controller
 * */

@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping("/hi")
	public String hello() {
		return "hello nuc-a";
	}

}
