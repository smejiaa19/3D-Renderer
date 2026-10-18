package scenes;

import javax.swing.*;
import java.awt.*;

public class MainScene extends  JFrame{

    public MainScene() {
        initUi();
    }

    private void initUi() {
        setTitle("3D Renderer");
        setSize(1200, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new MainScene();
            frame.setVisible(true);
        });
    }
}
