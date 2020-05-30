package cn.bynow.asuka;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AsukaApplication extends AbstractJavaFxApplicationSupport {
    public static void main(String[] args) {
        launch(AsukaApplication.class, HelloworldView.class,new SplashView(), args);
    }

    @Override
    public void beforeInitialView(Stage stage, ConfigurableApplicationContext ctx) {
        stage.setWidth(1000);
        stage.setHeight(1000);
    }
}
