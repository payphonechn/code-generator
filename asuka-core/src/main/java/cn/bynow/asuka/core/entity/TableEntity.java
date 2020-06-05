package cn.bynow.asuka.core.entity;

import lombok.Data;

import java.util.List;

@Data
public class TableEntity {
    private String tableName;
    private String comments;
    private ColumnEntity pk;
    private List<ColumnEntity> columns;
    private String className;

}
