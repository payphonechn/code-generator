package com.asuka.generator.controller;


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

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/updateDbConfig")
    public String updateDb(@RequestBody JSONObject beans){
        JSONArray arr = beans.getJSONArray("beans");
        webConfigService.updateDbConfig((List<DbEntity>)JSONArray.toCollection(arr,DbEntity.class));
        return "dbconfig";
    }
}
