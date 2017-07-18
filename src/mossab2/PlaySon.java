package mossab2;

import java.io.File;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.MediaPlayer;

class PlaySon implements Runnable {
String Son = null;
    public PlaySon(String son) {
        this.Son = son;
    }

    @Override
    public void run() {
        new JFXPanel();
        String f = new File(Son).toURI().toString();
        new MediaPlayer(new javafx.scene.media.Media(f)).play();

    }

}
