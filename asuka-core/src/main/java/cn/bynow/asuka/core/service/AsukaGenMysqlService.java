package cn.bynow.asuka.core.service;

import cn.bynow.asuka.core.mapper.AsukaGeneratorMysqlMapper;
import cn.bynow.asuka.core.utils.AsukaGenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
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

    @Autowired
    private AsukaGeneratorMysqlMapper asukaGeneratorMysqlMapper;

    public List<Map<String, Object>> queryList(Map<String, Object> map) {
        return asukaGeneratorMysqlMapper.queryList(map);
    }

    public int queryTotal(Map<String, Object> map) {
        return asukaGeneratorMysqlMapper.queryTotal(map);
    }

    public Map<String, String> queryTable(String tableName) {
        return asukaGeneratorMysqlMapper.queryTable(tableName);
    }

    public List<Map<String, String>> queryColumns(String tableName) {
        return asukaGeneratorMysqlMapper.queryColumns(tableName);
    }

    public byte[] generatorCode() {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            //查询表信息
            Map<String, String> table = queryTable(TABLE_NAME);
            //查询列信息
            List<Map<String, String>> columns = queryColumns(TABLE_NAME);
            //生成代码
           //  AsukaGenUtil.generatorCode(TABLE_NAME,);
            return null;
    }
}
