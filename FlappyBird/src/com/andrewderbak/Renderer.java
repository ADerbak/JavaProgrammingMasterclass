package com.andrewderbak;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JFrame {

    private static final long serialVersionUID = 1L;

    @Override
    public void paint(Graphics g){
        super.paint(g);

        FlappyBird.flappyBird.repaint(g);
    }

}
