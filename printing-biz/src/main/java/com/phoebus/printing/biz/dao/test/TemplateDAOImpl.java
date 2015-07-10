package com.phoebus.printing.biz.dao.test;

import javax.annotation.Resource;

import com.phoebus.printing.client.domain.test.Template;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Component;

@Component("templateDAO")
public class TemplateDAOImpl implements TemplateDAO {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	@Override
	public long createTemplate(Template template) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Template getTemplateById(long id) {
		Template template = sqlSessionTemplate.selectOne("template.getTemplateById", id);
		return template;
	}

}
