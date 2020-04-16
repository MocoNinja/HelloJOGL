package es.javier.learning.gfx.glCanvasLearn;

import java.util.ArrayList;
import java.util.List;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import es.javier.learning.gfx.model.CustomCanvas;

public class HelloWorldCanvas extends CustomCanvas {
    private List<Double> hLetterX, hLetterY;

    @Override
    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();

        gl.glBegin(GL2.GL_LINES);
        for (int index = 0; index < hLetterX.size(); index++) {
            gl.glVertex2d(hLetterX.get(index), hLetterY.get(index));
        }
        gl.glEnd();

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
    public void update() { }

}