package com.andrewderbak;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel {

    private static final long serialVersionUID = 1L;

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        FlappyBird.flappyBird.repaint(g);
    }

}
