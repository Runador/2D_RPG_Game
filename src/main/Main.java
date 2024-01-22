package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("2d adventure");
        //window.setLocationRelativeTo(null);
        window.setVisible(true);

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);
        window.pack();

        gamePanel.startGameThread();

    }
}
