package com.phoebus.printing.web.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 * bean配置见"/printing-web/src/main/webapp/WEB-INF/pageconfig/spring-test-page.xml"
 * http://localhost:8080/test/sampleAbstractController.html
 * 
 * @author <a href="mailto:xingheng.yxc@taobao.com">xingheng.yxc</a>
 * @version 1.0
 * @since 2015年7月9日
 */
// AbstractController对应的beanName，就是url中的路径映射
@Component("/test/sampleAbstractController.html")
public class SampleAbstractController extends AbstractController {

	public SampleAbstractController() {
		// 设置支持的请求类型
		this.setSupportedMethods(AbstractController.METHOD_POST, AbstractController.METHOD_GET);
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
//		arg0.getServletContext().getInitParameterNames();
		// 其中"/test/test映射的是模版"
		ModelAndView modelAndView = new ModelAndView("/test/test");

		modelAndView.addObject("message", "SampleAbstractController test!");

		return modelAndView;
	}

}