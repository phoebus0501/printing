package com.phoebus.printing.web.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 生成json http://localhost:8080/test/springRestController.json
 * 
 * @author <a href="mailto:xingheng.yxc@taobao.com">xingheng.yxc</a>
 * @version 1.0
 * @since 2015年7月10日
 */
@RestController
@RequestMapping("/test")
public class SpringRestController {
	private static final Logger LOG = LoggerFactory.getLogger(SpringRestController.class);

	@RequestMapping(value = "/springRestController.json", method = { RequestMethod.GET }, produces = "application/json;charset=utf-8")
	public Object getUserList() {
		List<User1> tournamentList = new ArrayList<User1>();
		for (int i = 0; i < 10; i++) {
			tournamentList.add(new User1("firstname" + i, "lastName" + i));
		}

		LOG.debug("Hello world.");
		return tournamentList;
	}

}
