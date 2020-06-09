package cn.bynow.asuka.core.service;

import cn.bynow.asuka.core.utils.DataSourceUtil;
import cn.bynow.asuka.core.utils.AsukaGenUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author Bynow
 * @version 1.0
 * @date 2020/5/31 22:56
 */
@Service
public class AsukaGenMysqlService {

    private final String TABLE_NAME = "sys_user";
    private final String URL = "jdbc:mysql://127.0.0.1:3306/guns?useUnicode=true&amp;characterEncoding=UTF-8&amp;useInformationSchema=true&amp;useSSL=false";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String USER = "root";
    private final String PASSWORD = "root!";

    public void test() throws Exception {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        JdbcTemplate template = new JdbcTemplate(DataSourceUtil.getDataSource(DRIVER,URL,USER,PASSWORD));
        //根据表名查询表实例
        Map table = template.queryForMap("select table_name tableName, engine, table_comment tableComment, create_time createTime from information_schema.tables where table_schema = (select database()) and table_name = 'sys_user'");
        List columns = template.queryForList("select column_name columnName, data_type dataType, column_comment columnComment, column_key columnKey, extra from information_schema.columns where table_name = 'sys_user' and table_schema = (select database()) order by ordinal_position");
        AsukaGenUtils.generatorCode(table, columns);



    }


}
