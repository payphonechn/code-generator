package cn.bynow.asuka.controller;

import cn.bynow.asuka.AsukaApplication;
import cn.bynow.asuka.service.ITestService;
import cn.bynow.asuka.view.DataSourceView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Bynow
 * @version 1.0
 * @date 2020/5/30 21:05
 */
@FXMLController
public class MainController{

    @Autowired
    private ITestService iTestService;

    @FXML
    private void choose(){
        try {
            AsukaApplication.showView(DataSourceView.class);
            iTestService.test();
        }catch (Exception e){

        }
    }
}
