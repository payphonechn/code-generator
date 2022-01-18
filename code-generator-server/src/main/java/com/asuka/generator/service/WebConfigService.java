package com.asuka.generator.service;

import com.asuka.generator.model.DbEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author payphone
 * @date 2022/1/4 3:27
 */
@Service
public class WebConfigService {

    public void updateDbConfig(List<DbEntity> arr){
        arr.forEach(o -> {
                System.out.println(o.getValue());
        });

    }
}
