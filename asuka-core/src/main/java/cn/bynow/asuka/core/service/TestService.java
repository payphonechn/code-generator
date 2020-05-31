package cn.bynow.asuka.core.service;

import cn.bynow.asuka.core.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Bynow
 * @version 1.0
 * @date 2020/5/31 16:45
 */
@Service
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public void test(){
        System.out.println(testMapper.queryTotal());
    }
}
