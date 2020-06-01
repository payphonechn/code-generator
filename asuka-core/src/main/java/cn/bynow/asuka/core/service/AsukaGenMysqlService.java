package cn.bynow.asuka.core.service;

import cn.bynow.asuka.core.utils.DataSourceUtil;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Bynow
 * @version 1.0
 * @date 2020/5/31 22:56
 */
@Service
public class AsukaGenMysqlService {

    private final String TABLE_NAME = "sys_user";
    private final String URL = "jdbc:mysql://127.0.0.4:3306/guns";
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String USER = "root";
    private final String PASSWORD = "root!";

    public void test(){
        JdbcTemplate template = new JdbcTemplate(DataSourceUtil.getDataSource(DRIVER,URL,USER,PASSWORD));
        Map list = template.queryForMap("select * from sys_user");
        System.out.println(list);
    }


}
