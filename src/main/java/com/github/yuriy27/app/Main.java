package com.github.yuriy27.app;

import com.github.yuriy27.config.Config;
import com.github.yuriy27.gui.MainPanel;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Created by Юра on 10.09.2016.
 */
public class Main {

    public static void main(String[] args) {
        Config.load();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        JFrame f = new JFrame("Рассылка");
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        MainPanel n = new MainPanel();
        f.setSize(new Dimension(590, 380));
        f.setResizable(false);
        f.getContentPane().add(n);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

}
