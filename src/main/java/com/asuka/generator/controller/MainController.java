package com.asuka.generator.controller;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.asuka.generator.entity.DbEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author payphone
 * @date 2022/1/3 11:28
 */
@Controller
public class MainController {


    @RequestMapping("/hello")
    public String test(){
        FileReader fileReader = new FileReader("D:\\work\\workplace\\local\\code-generator\\src\\main\\java\\resources\\db.json");


        DbEntity db = new DbEntity();
        db.setKey("MySql");
        db.setValue("link");
        JSONObject json = JSONUtil.parseObj(db, false);
        FileWriter writer = new FileWriter("D:\\work\\workplace\\local\\code-generator\\src\\main\\java\\resources\\db.json");
        writer.write(json.toString());
        return "index";
    }
}
