package cn.bynow.asuka.core.utils;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * @author Bynow
 * @version 1.0
 * @date 2020/6/1 22:04
 */
public class DataSourceUtil {

    public static DriverManagerDataSource getDataSource(String driver,String url,String user,String password){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    };



}
