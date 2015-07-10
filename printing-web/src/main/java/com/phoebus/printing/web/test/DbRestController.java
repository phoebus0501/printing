package com.phoebus.printing.web.test;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.phoebus.printing.biz.dao.test.TemplateDAO;

/**
 * 生成json http://localhost:8080/test/dbRestController.json
 * 
 * @author <a href="mailto:xingheng.yxc@taobao.com">xingheng.yxc</a>
 * @version 1.0
 * @since 2015年7月10日
 */
@RestController
@RequestMapping("/test")
public class DbRestController {

	@Resource
	private TemplateDAO templateDAO;

	@RequestMapping(value = "/dbRestController.json", method = { RequestMethod.GET }, produces = "application/json;charset=utf-8")
	public Object getTemplate() {

		return this.templateDAO.getTemplateById(4624L);
	}

}
