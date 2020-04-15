package es.javier.learning.gfx;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;

public class App implements GLEventListener {

    private List<Double> hLetterX, hLetterY;

    @Override
    public void display(GLAutoDrawable draw) {
        final GL2 gl = draw.getGL().getGL2();

        gl.glBegin(GL2.GL_LINES);
        for (int index = 0; index < hLetterX.size(); index++) {
            gl.glVertex2d(hLetterX.get(index), hLetterY.get(index));
        }
        gl.glEnd();

    }

    @Override
    public void dispose(GLAutoDrawable arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void init(GLAutoDrawable arg0) {
        hLetterX = new ArrayList<>() {
            {
                add(-0.8);
                add(-0.8);
                add(-0.8);
                add(-0.4);
                add(-0.4);
                add(-0.4);
            }
        };

        hLetterY = new ArrayList<>() {
            {
                add(0.6);
                add(-0.6);
                add(0.0);
                add(0.0);
                add(0.6);
                add(-0.6);
            }
        };
    }

    @Override
    public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {

    }

    public static void main(String[] args) {
        final GLProfile gp = GLProfile.get(GLProfile.GL2);
        GLCapabilities cap = new GLCapabilities(gp);

        final GLCanvas gc = new GLCanvas(cap);
        App sq = new App();
        gc.addGLEventListener(sq);
        gc.setSize(320, 200);

        final JFrame frame = new JFrame("Hello world, OPENGL");
        frame.add(gc);
        frame.setSize(320 * 4, 200 * 4);
        frame.setVisible(true);
    }

}
