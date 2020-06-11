package cn.bynow.asuka.ui.controller;

import cn.bynow.asuka.core.entity.MysqlDominEntity;
import cn.bynow.asuka.core.service.AsukaGenMysqlService;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Bynow
 * @version 1.0
 * @date 2020/5/30 21:56
 */
@FXMLController
public class MysqlSourceController {

    @Autowired
    private AsukaGenMysqlService asukaGenMysqlService;

    @FXML
    private TextField packagePath;

    @FXML
    private TextField author;

    @FXML
    private TextField filePath;

    @FXML
    private TextField password;

    @FXML
    private TextField tableName;

    @FXML
    private TextField database;



    @FXML
    private void atCode() {
        validParams();
        MysqlDominEntity domin = new MysqlDominEntity();
        domin.setAuthor(author.getText());
        System.out.println(database.getText());
        try{
            asukaGenMysqlService.test();
        }catch (Exception e){

        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("SUCCESS");
        alert.setContentText("I have a great message for you!");

        alert.showAndWait();
    }

    private void validParams(){
        if (StringUtils.isBlank(packagePath.getText())){
            warningMsg("packagePath");
        }
        if (StringUtils.isBlank(author.getText())){
            warningMsg("author");
        }
        if (StringUtils.isBlank(filePath.getText())){
            warningMsg("filePath");
        }
        if (StringUtils.isBlank(password.getText())){
            warningMsg("password");
        }
        if (StringUtils.isBlank(tableName.getText())){
            warningMsg("tableName");
        }
        if (StringUtils.isBlank(database.getText())){
            warningMsg("database");
        }
    }

    private void warningMsg(String desc){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("WARNING");
        alert.setContentText(desc + "can not be null");
        alert.showAndWait();
    }
}
