package com.eports.ad.codegen.entity;

import lombok.Data;

/**
 * Column Entity
 *
 * @author Hanping QIAO
 * 2018-08-30 下午5:17
 **/
@Data
public class ColumnEntity {
    /**
     * column name
     */
    private String columnName;
    /**
     * data type
     */
    private String dataType;
    /**
     * comments
     */
    private String comments;

    /**
     * case attribute name
     */
    private String caseAttrName;
    /**
     * lower attribute name
     */
    private String lowerAttrName;
    /**
     *  attribute type
     */
    private String attrType;
    /**
     *  other infos
     */
    private String extra;
}
