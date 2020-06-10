package cn.bynow.asuka.ui.controller;

import cn.bynow.asuka.ui.AsukaApplication;
import cn.bynow.asuka.ui.view.MysqlSourceView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;

/**
 * @author Bynow
 * @version 1.0
 * @date 2020/5/30 21:05
 */
@FXMLController
public class MainController {


    @FXML
    private void choose() {
        AsukaApplication.showView(MysqlSourceView.class);
    }

}
