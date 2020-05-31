package cn.bynow.asuka.ui.controller;

import cn.bynow.asuka.core.service.AsukaGenMysqlService;
import cn.bynow.asuka.core.service.TestService;
import cn.bynow.asuka.ui.AsukaApplication;
import cn.bynow.asuka.ui.view.DataSourceView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Bynow
 * @version 1.0
 * @date 2020/5/30 21:05
 */
@FXMLController
public class MainController {

    @Autowired
    private TestService testService;

    @Autowired
    private AsukaGenMysqlService asukaGenMysqlService;


    @FXML
    private void choose() {
        try {
            AsukaApplication.showView(DataSourceView.class);
            testService.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
