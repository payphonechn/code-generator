package cn.bynow.asuka;

import de.felixroske.jfxsupport.AbstractFxmlView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import de.felixroske.jfxsupport.GUIState;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AsukaApplication extends AbstractJavaFxApplicationSupport {
    public static void main(String[] args) {
        launch(AsukaApplication.class, HelloworldView.class,new SplashView(), args);
    }

    @Override
    public void beforeShowingSplash(Stage splashStage) {
        splashStage.getIcons().add(new Image("icon.png"));
    }


    @Override
    public void beforeInitialView(Stage stage, ConfigurableApplicationContext ctx) {
        stage.setWidth(1000);
        stage.setHeight(1000);
        GUIState.getStage().getIcons().add(new Image("icon.png"));
        GUIState.getStage().show();
    }
}
