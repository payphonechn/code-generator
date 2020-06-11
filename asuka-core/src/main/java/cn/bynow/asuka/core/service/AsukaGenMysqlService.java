package cn.bynow.asuka.core.service;

import cn.bynow.asuka.core.entity.MysqlDominEntity;
import cn.bynow.asuka.core.utils.AsukaGenUtils;
import cn.bynow.asuka.core.utils.DataSourceUtil;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Bynow
 * @version 1.0
 * @date 2020/5/31 22:56
 */
@Service
public class AsukaGenMysqlService {

    private final String DRIVER = "com.mysql.jdbc.Driver";

    private final String DATABSE_SSL = "?useUnicode=true&amp;characterEncoding=UTF-8&amp;useInformationSchema=true&amp;useSSL=false";

    public void generatorCodeForMysql(MysqlDominEntity domin) throws Exception {
        JdbcTemplate template = new JdbcTemplate(DataSourceUtil.getDataSource(DRIVER, domin.getDatabase() + DATABSE_SSL, domin.getUser(), domin.getPassword()));
        //根据表名查询表实例
        Map table = template.queryForMap("select table_name tableName, engine, table_comment tableComment, create_time createTime from information_schema.tables where table_schema = (select database()) and table_name = '" + domin.getTableName() + "'");
        List columns = template.queryForList("select column_name columnName, data_type dataType, column_comment columnComment, column_key columnKey, extra from information_schema.columns where table_name = '" + domin.getTableName() + "' and table_schema = (select database()) order by ordinal_position");
        AsukaGenUtils.generatorCode(table, columns);
    }


}
