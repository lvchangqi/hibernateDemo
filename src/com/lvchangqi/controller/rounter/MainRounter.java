package com.lvchangqi.controller.rounter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/rounter")
public class MainRounter {
	
	@RequestMapping(value="/index.html")
	public String change(){
		return "index";
	}
}
