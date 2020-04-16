package es.javier.learning.gfx.glCanvasLearn;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import es.javier.learning.gfx.model.CustomCanvas;

public class ScreenPointsCanvas extends CustomCanvas {

    @Override
    public void init(GLAutoDrawable drawable) { }

    @Override
    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glBegin(GL2.GL_POINTS);
        gl.glColor3f(255, 0, 0);
        gl.glVertex2d(-0.99, -0.99);
        gl.glVertex2d(-0.99, 0);
        gl.glVertex2d(-0.99, 0.99);
        gl.glColor3f(0, 255, 0);
        gl.glVertex2d(0, -0.99);
        gl.glVertex2d(0, 0);
        gl.glVertex2d(0, 0.99);
        gl.glColor3f(0,0,255);
        gl.glVertex2d(0.99, -0.99);
        gl.glVertex2d(0.99, 0);
        gl.glVertex2d(0.99, 0.99);
        gl.glEnd();
    }

    @Override
    public void update() { }

}