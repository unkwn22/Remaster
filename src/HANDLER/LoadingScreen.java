package HANDLER;

import javax.swing.*;
import java.awt.*;

public class LoadingScreen {
    Container container;

    JProgressBar progressBar;
    // JProgressBar properties
    boolean stringPainted = true;

    // properties for loading gage
    int boundX                  = 90;
    int boundY                  = 100;
    int boundWidth              = 600;
    int boundHeight             = 150;

    // valid name
    String name;

    // starting potion amount
    int startPotionAmount = 5;

    public LoadingScreen(String name, Container container) {
        this.container = container;
        this.name      = name;
        init();
    }

    public void init(){
        progressBar = new JProgressBar();
        progressBar.setValue(0);
        progressBar.setBounds(boundX, boundY, boundWidth, boundHeight);
        // adding percentage to progress bar
        progressBar.setStringPainted(stringPainted);
        container.add(progressBar);

    }
}
