package com.eports.ad.codegen.service;

import com.eports.ad.codegen.entity.GenConfig;
import com.eports.ad.codegen.util.Query;

import java.util.List;
import java.util.Map;


public interface SysGeneratorService {
	/**
	 * generate code
	 *
	 * @param tableNames 表名称
	 * @return
	 */
	byte[] generatorCode(GenConfig tableNames);

	/**
	 * get tables info by pagination
	 * @param query 查询条件
	 * @return
	 */
	List<Map<String,Object>> queryPage(Query query);
}
