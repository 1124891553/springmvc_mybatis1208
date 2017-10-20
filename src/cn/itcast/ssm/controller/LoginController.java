package cn.itcast.ssm.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.ssm.po.UserCustom;
import cn.itcast.ssm.po.UserQuery;
import cn.itcast.ssm.service.UsersService;


@Controller
public class LoginController {
	@Autowired
	private UsersService usersService;
	// 登陆
	@RequestMapping("/login")
	public String login(HttpSession session, UserQuery userQuery)
			throws Exception {

		UserCustom userCustom = usersService.findUserBylogin(userQuery);
		// 在session中保存用户身份信息
		if(userCustom!=null){
		session.setAttribute("username", userCustom.getUsername());
		// 重定向到商品列表页面
		return "redirect:/items/queryItems.action";
		
		}
		return "nologin";
	}
	
	// 退出
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception {

		// 清除session
		session.invalidate();

		// 重定向到商品列表页面
		return "redirect:/items/queryItems.action";
	}

}
