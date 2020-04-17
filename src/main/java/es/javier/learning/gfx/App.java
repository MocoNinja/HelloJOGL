package es.javier.learning.gfx;

import javax.swing.JFrame;

import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;

import es.javier.learning.gfx.glCanvasLearn.*;
import es.javier.learning.gfx.model.CustomCanvas;

public class App {

    public static void main(String[] args) {
        final int WIDTH = 1920, HEIGHT = 1080, SCALE = 4;

        String title = "Hello world, OPENGL";
        if (args.length >= 2 && ! args[1].equals("")) {
            title = args[1];
        }

        final GLProfile gp = GLProfile.get(GLProfile.GL2);
        GLCapabilities cap = new GLCapabilities(gp);

        final GLCanvas gc = new GLCanvas(cap);
        final CustomCanvas sq   = new RandomTriangleCanvas(WIDTH, HEIGHT);
        gc.addGLEventListener(sq);
        gc.setSize(WIDTH, HEIGHT);

        final JWindow window = new JWindow(WIDTH, HEIGHT, title, gc);

    }

}
