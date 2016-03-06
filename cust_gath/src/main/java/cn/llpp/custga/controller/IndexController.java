package cn.llpp.custga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	/**
	 * Ê×Ò³
	 * @return
	 */
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
