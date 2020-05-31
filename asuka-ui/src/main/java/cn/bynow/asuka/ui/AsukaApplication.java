package cn.bynow.asuka.ui;

import cn.bynow.asuka.ui.view.MainView;
import cn.bynow.asuka.ui.view.SplashView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import de.felixroske.jfxsupport.GUIState;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication(scanBasePackages = "cn.bynow.asuka.*")
@MapperScan("cn.bynow.asuka.core.mapper")
public class AsukaApplication extends AbstractJavaFxApplicationSupport {
    public static void main(String[] args) {
        launch(AsukaApplication.class, MainView.class, new SplashView(), args);
    }

    @Override
    public void beforeShowingSplash(Stage splashStage) {
        splashStage.getIcons().add(new Image("/static/icon.png"));
    }


    @Override
    public void beforeInitialView(Stage stage, ConfigurableApplicationContext ctx) {
        stage.setWidth(1000);
        stage.setHeight(800);
        GUIState.getStage().getIcons().add(new Image("/static/icon.png"));
        GUIState.getStage().show();
    }
}
