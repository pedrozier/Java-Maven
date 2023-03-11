package com.standard.traytest;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;

public class TrayTest {

    public static void main(String[] args) {

        SystemTray systemTray = SystemTray.getSystemTray();

        PopupMenu popupMenu = new PopupMenu();

        MenuItem test = new MenuItem("Test");
        MenuItem exit = new MenuItem("Exit");

        test.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("test is ok");
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        popupMenu.add(test);
        popupMenu.add(exit);

        try {
            ClassLoader loader = TrayTest.class.getClassLoader();

            Image image = ImageIO.read(TrayTest.class.getClassLoader().getResource("icon.png"));

            TrayIcon trayIcon = new TrayIcon(image, "My Test", popupMenu);

            trayIcon.setImageAutoSize(true);

            trayIcon.setPopupMenu(popupMenu);

            systemTray.add(trayIcon);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
