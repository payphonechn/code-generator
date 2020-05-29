package cn.bynow.asuka;

import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AsukaApplication extends AbstractJavaFxApplicationSupport {
    public static void main(String[] args) {
        launch(AsukaApplication.class, HelloworldView.class, args);
    }
}
