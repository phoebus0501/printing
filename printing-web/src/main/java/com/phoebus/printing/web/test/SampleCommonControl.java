package com.phoebus.printing.web.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * http://localhost:8080/test/sampleCommonControl.html
 * 
 * @author <a href="mailto:xingheng.yxc@taobao.com">xingheng.yxc</a>
 * @version 1.0
 * @since 2015年7月9日
 */
@Controller
@RequestMapping("/test")
public class SampleCommonControl {

	/**
	 * 可以设置接收的请求类型，例如：RequestMethod.POST
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/sampleCommonControl.html", method = RequestMethod.GET)
	public String render(User user, // 对象绑定参数
			@RequestParam(required = false, value = "lastName", defaultValue = "") String a, // 单个绑定参数
			ModelMap model // 数据上下文，页面渲染用
	) {
		model.addAttribute("message", "Hello!" + a);
		model.addAttribute("message", "Hello!" + user.getFirstName() + user.getLastName());
		// 返回的是模版名称
		return "/test/test";
	}

}

class User {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
