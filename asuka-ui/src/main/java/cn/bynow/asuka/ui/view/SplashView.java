package cn.bynow.asuka.ui.view;

import de.felixroske.jfxsupport.SplashScreen;
import javafx.scene.Parent;

/**
 * @author Bynow
 * @version 1.0
 * @date 2020/5/30 16:33
 */
public class SplashView extends SplashScreen {

    @Override
    public Parent getParent() { // 在这里可以设置闪屏窗口大小，默认图片大小
        return super.getParent();
    }

    @Override
    public boolean visible() { // 是否显示闪屏，默认显示
        return super.visible();
    }

    @Override
    public String getImagePath() {
        return "/static/asuka.gif";
    }

}
