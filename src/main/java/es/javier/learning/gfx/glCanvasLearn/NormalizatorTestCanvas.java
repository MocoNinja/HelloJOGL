package es.javier.learning.gfx.glCanvasLearn;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import es.javier.learning.gfx.model.CustomCanvas;
import es.javier.learning.gfx.utils.Normalizator;

public class NormalizatorTestCanvas extends CustomCanvas{
    private final Normalizator norm;
    private final int WIDTH, HEIGHT;

    public NormalizatorTestCanvas(int width, int height) {
        norm = new Normalizator(width, height);
        WIDTH = width;
        HEIGHT = height;
    }
    
    @Override
    public void init(GLAutoDrawable drawable) { }

    @Override
    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glBegin(GL2.GL_POINTS);
        gl.glColor3f(155, 0, 0);
        gl.glVertex2d(-0.99 + 0.1, -0.99);
        gl.glVertex2d(-0.99 + 0.1, 0);
        gl.glVertex2d(-0.99 + 0.1, 0.99);
        gl.glColor3f(255, 0, 0);
        gl.glVertex2d(norm.getNormX(2), norm.getNormY(2));
        gl.glVertex2d(norm.getNormX(2), norm.getNormY(HEIGHT / 2));
        gl.glVertex2d(norm.getNormX(2), norm.getNormY(HEIGHT - 2));
        gl.glColor3f(0, 155, 0);
        gl.glVertex2d(0, -0.99 + 0.1);
        gl.glVertex2d(0, 0 + 0.1);
        gl.glVertex2d(0, 0.99 - 0.1);
        gl.glColor3f(155, 155, 0);
        gl.glVertex2d(norm.getNormX(WIDTH / 2), norm.getNormY(2));
        gl.glVertex2d(norm.getNormX(WIDTH / 2), norm.getNormY(HEIGHT / 2));
        gl.glVertex2d(norm.getNormX(WIDTH / 2), norm.getNormY(HEIGHT - 2));
        gl.glColor3f(0,0,255);
        gl.glVertex2d(0.99, -0.99);
        gl.glVertex2d(0.99, 0);
        gl.glVertex2d(0.99, 0.99);
        gl.glColor3f(255,0,255);
        gl.glVertex2d(norm.getNormX(WIDTH - 2), norm.getNormY(2));
        gl.glVertex2d(norm.getNormX(WIDTH - 2), norm.getNormY(HEIGHT / 2));
        gl.glVertex2d(norm.getNormX(WIDTH - 2), norm.getNormY(HEIGHT - 2));
        gl.glEnd();

    }

    @Override
    public void update() { }
}