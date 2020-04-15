package es.javier.learning.gfx;

import javax.swing.JFrame;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;

import es.javier.learning.gfx.glCanvasLearn.HelloWorldCanvas;

public class App {

    public static void main(String[] args) {
        final GLProfile gp = GLProfile.get(GLProfile.GL2);
        GLCapabilities cap = new GLCapabilities(gp);

        final GLCanvas gc = new GLCanvas(cap);
        HelloWorldCanvas sq = new HelloWorldCanvas();
        gc.addGLEventListener(sq);
        gc.setSize(320, 200);

        final JFrame frame = new JFrame("Hello world, OPENGL");
        frame.add(gc);
        frame.setSize(320 * 4, 200 * 4);
        frame.setVisible(true);
    }

}
