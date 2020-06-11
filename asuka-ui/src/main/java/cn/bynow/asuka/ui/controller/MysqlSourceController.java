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
    private TextField user;



    @FXML
    private boolean atCode() {
        if (!validParams()) return false;
        MysqlDominEntity domin = new MysqlDominEntity();
        domin.setAuthor(author.getText().trim());
        domin.setPackagePath(packagePath.getText().trim());
        domin.setDatabase(database.getText().trim());
        domin.setFilePath(filePath.getText().trim());
        domin.setPassword(password.getText().trim());
        domin.setTableName(tableName.getText().trim());
        domin.setUser(user.getText().trim());
        try{
            asukaGenMysqlService.generatorCodeForMysql(domin);
        }catch (Exception e){
            e.printStackTrace();
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("SUCCESS");
        alert.setContentText("I have a great message for you!");

        alert.showAndWait();
        return true;
    }

    private boolean validParams(){
        if (StringUtils.isBlank(packagePath.getText())){
            return warningMsg("packagePath ");
        }
        if (StringUtils.isBlank(author.getText())){
            return warningMsg("author ");
        }
        if (StringUtils.isBlank(filePath.getText())){
            return warningMsg("filePath ");
        }
        if (StringUtils.isBlank(password.getText())){
            return warningMsg("password ");
        }
        if (StringUtils.isBlank(tableName.getText())){
            return warningMsg("tableName ");
        }
        if (StringUtils.isBlank(database.getText())){
            return warningMsg("database ");
        }
        if (StringUtils.isBlank(user.getText())){
            return warningMsg("user ");
        }
        return true;
    }

    private boolean warningMsg(String desc){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("WARNING");
        alert.setContentText(desc + "can not be null");
        alert.showAndWait();
        return false;
    }
}
