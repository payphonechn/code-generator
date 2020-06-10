package cn.bynow.asuka.ui.controller;

import cn.bynow.asuka.core.service.AsukaGenMysqlService;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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
        System.out.println(database.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("SUCCESS");
        alert.setContentText("I have a great message for you!");

        alert.showAndWait();
    }


}
