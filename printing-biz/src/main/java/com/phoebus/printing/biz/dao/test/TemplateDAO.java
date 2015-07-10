package com.phoebus.printing.biz.dao.test;

import com.phoebus.printing.client.domain.test.Template;

public interface TemplateDAO {

	/**
	 * 创建模板
	 * 
	 * @param template
	 * @throws DAOException
	 */
	long createTemplate(Template template);

	/**
	 * 通过ID查询模板
	 * 
	 * @param id
	 * @return
	 * @throws DAOException
	 */
	Template getTemplateById(long id);

}
