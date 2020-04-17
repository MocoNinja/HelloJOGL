package es.javier.learning.gfx;

import com.jogamp.opengl.awt.GLCanvas;

import javax.swing.*;

public class JWindow extends JFrame {
    private final int WIDTH, HEIGHT;
    private final GLCanvas GL_CANVAS;
    private final String TITLE;

    public JWindow(int width, int height, String title, GLCanvas gc) {
        this.WIDTH = width;
        this.HEIGHT = height;
        this.TITLE = title;
        this.GL_CANVAS = gc;
        this.setSize(WIDTH, HEIGHT);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle(TITLE);
        this.add(GL_CANVAS);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
