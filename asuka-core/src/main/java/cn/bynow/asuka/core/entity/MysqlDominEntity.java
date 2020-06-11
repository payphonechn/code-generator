package cn.bynow.asuka.core.entity;

import lombok.Data;

/**
 * @author Bynow
 * @version 1.0
 * @date 2020/6/11 11:33
 */
@Data
public class MysqlDominEntity {
    private String filePath;
    private String author;
    private String packagePath;
    private String password;
    private String tableName;
    private String database;


}
