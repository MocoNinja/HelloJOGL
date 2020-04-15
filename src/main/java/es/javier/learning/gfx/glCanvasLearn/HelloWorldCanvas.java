package es.javier.learning.gfx.glCanvasLearn;

import java.util.ArrayList;
import java.util.List;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

public class HelloWorldCanvas implements GLEventListener {
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
}