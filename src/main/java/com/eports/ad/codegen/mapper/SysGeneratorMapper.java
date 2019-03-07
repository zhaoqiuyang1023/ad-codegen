package com.eports.ad.codegen.mapper;


import com.eports.ad.codegen.util.Query;

import java.util.List;
import java.util.Map;

/**
 * 代码生成器
 *
 */
public interface SysGeneratorMapper{

	/**
	 * get tables info by pagination
	 *
	 * @param params
	 * @return
	 */
	List<Map<String, Object>> queryList(Query params);

	/**
	 * get total of tables
	 *
	 * @param query
	 * @return
	 */
	int queryTotal(Map query);

	/**
	 * get table infos
	 * @param tableName table name
	 * @return
	 */
	Map<String, String> queryTable(String tableName);

	/**
	 * Get columns infos of table
	 * @param tableName 表名称
	 * @return
	 */
	List<Map<String, String>> queryColumns(String tableName);
}
