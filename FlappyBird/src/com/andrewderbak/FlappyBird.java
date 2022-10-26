package com.andrewderbak;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class FlappyBird extends JInternalFrame implements ActionListener {

    public static FlappyBird flappyBird;
    public final int WIDTH = 800, HEIGHT = 800;

    public boolean gameOver, started = true;
    public Renderer renderer;
    public Rectangle bird;
    public int ticks, yMotion;
    public ArrayList<Rectangle> columns;
    public Random rand;

    public FlappyBird(){
        JFrame jframe = new JFrame();
        Timer timer = new Timer(20, this);


        renderer = new Renderer();
        rand = new Random();
//
        jframe.add(renderer);
        jframe.setTitle("Andrew's Flappy Bird Demo");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(WIDTH,HEIGHT);
        jframe.setResizable(false);
        jframe.setVisible(true);

        bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
        columns = new ArrayList<Rectangle>();

        addColumn(true);
        addColumn(true);
        addColumn(true);
        addColumn(true);


        timer.start();
    }

    public void addColumn(boolean start) {
        int space = 300;
        int width = 100;
        int height = rand.nextInt(300);

        if (start) {
            columns.add(new Rectangle(WIDTH + width + columns.size() * 300, HEIGHT - height - 120, width, height));
            columns.add(new Rectangle(WIDTH + width + (columns.size() - 1) * 300, 0, width, HEIGHT - height - space));
        } else {
            columns.add(new Rectangle(columns.get(columns.size() - 1).x + 600, HEIGHT - height - 120, width, height));
            columns.add(new Rectangle(columns.get(columns.size() - 1).x, 0, width, HEIGHT - height - space));
        }
    }



    public void paintColumns(Graphics g, Rectangle column){

        g.setColor(Color.GREEN.darker());
        g.fillRect(column.x, column.y, column.width, column.height);
    }

    public void  repaint(Graphics g){

//        System.out.println("hello");

        g.setColor(Color.cyan);
        g.fillRect(0, 0 , WIDTH, HEIGHT);

        g.setColor(Color.ORANGE);
        g.fillRect(0, HEIGHT-150, WIDTH, 150);

        g.setColor(Color.GREEN);
        g.fillRect(0, HEIGHT-150, WIDTH, 30);

        g.setColor(Color.RED);
        g.fillRect(bird.x, bird.y, bird.width, bird.height);


        for (Rectangle column: columns){
            paintColumns(g, column);
        }

        if(gameOver) {
            g.setColor(Color.white);
            g.setFont(new Font("Arial", 1, 100));
            if (gameOver) {
                g.drawString("Game Over!", 100, HEIGHT / 2 - 50);
            }
        }

    }

    public static void main(String[] args) {
        flappyBird = new FlappyBird();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        int speed = 10;

        ticks++;

        if(started) {
            for (int i = 0; i < columns.size(); i++) {
                Rectangle column = columns.get(i);
                column.x -= speed;
            }

            if (ticks % 2 == 0 && yMotion < 15) {
                yMotion += 2;
            }

            for (int i = 0; i < columns.size(); i++) {
                Rectangle column = columns.get(i);
                if (column.x + column.width < 0) {
                    columns.remove(column);
                    if (column.y == 0) {
                        addColumn(false);
                    }
                }
            }


            bird.y += yMotion;

            for (Rectangle column : columns) {
                if (column.intersects(bird)) {
                    gameOver = true;
                }
            }

            if (bird.y > HEIGHT - 120 || bird.y < 0) {
                gameOver = true;
            }
        }

        renderer.repaint();
    }

}
