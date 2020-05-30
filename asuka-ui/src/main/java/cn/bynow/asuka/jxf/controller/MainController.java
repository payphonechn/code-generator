package cn.bynow.asuka.jxf.controller;

import cn.bynow.asuka.AsukaApplication;
import cn.bynow.asuka.jxf.view.DataSourceView;
import cn.bynow.asuka.jxf.view.MainView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;

/**
 * @author Bynow
 * @version 1.0
 * @date 2020/5/30 21:05
 */
@FXMLController
public class MainController{

    @FXML
    private void choose(){
        AsukaApplication.showView(DataSourceView.class);
    }
}
