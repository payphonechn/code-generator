package cn.bynow.asuka.core.entity;


import lombok.Data;

@Data
public class ColumnEntity {
    private String columnName;
    private String dataType;
    private String comments;
    private String attrName;
    private String attrType;
    private String extra;
}
