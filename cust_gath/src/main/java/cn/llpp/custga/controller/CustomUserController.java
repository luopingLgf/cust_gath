package cn.llpp.custga.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.llpp.custga.model.CustomUser;

/**
 * test handler
 * @author Ruby
 *
 */
@Controller
@RequestMapping("/customUser")
public class CustomUserController {

	/**
	 * 
	 * @return
	 */
	@RequestMapping("/getUser")
	public CustomUser getUsers(){
		
		return null;
	}
}
