package cn.bynow.asuka.service;

import cn.bynow.asuka.utils.AsukaGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Bynow
 * @version 1.0
 * @date 2020/5/31 1:07
 */
@Service
public class TestService implements ITestService {


    @Override
    public void test() {
        AsukaGenerator.generatorCode(null,null,null);
    }


}
