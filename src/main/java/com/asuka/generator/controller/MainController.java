package com.asuka.generator.controller;



import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.json.JSONUtil;
import com.asuka.generator.model.DbEntity;
import com.asuka.generator.service.WebConfigService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author payphone
 * @date 2022/1/3 11:28
 */
@Controller
public class MainController {

    @Autowired
    public WebConfigService webConfigService;

    @RequestMapping("/hello")
    public String test(){
        FileReader fileReader = new FileReader("D:\\work\\workplace\\local\\code-generator\\src\\main\\java\\resources\\db.json");
        DbEntity db = new DbEntity();
        db.setKey("MySql");
        db.setValue("link");
        //JSONObject json = JSONUtil.parseObj(db, false);
        FileWriter writer = new FileWriter("D:\\work\\workplace\\local\\code-generator\\src\\main\\java\\resources\\db.json");
        //writer.write(json.toString());
        return "index";
    }

    @RequestMapping("/updateDbConfig")
    public String updateDb(@RequestBody JSONObject beans){
        JSONArray arr = beans.getJSONArray("beans");
        webConfigService.updateDbConfig((List<DbEntity>)JSONArray.toCollection(arr,DbEntity.class));
        return "dbconfig";
    }
}
