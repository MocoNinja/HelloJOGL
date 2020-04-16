package es.javier.learning.gfx.glCanvasLearn;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import es.javier.learning.gfx.model.CustomCanvas;
import es.javier.learning.gfx.model.Triangle;
import es.javier.learning.gfx.utils.Normalizator;

public class RandomTriangleCanvas extends CustomCanvas {

    Triangle triangle;
    private final Normalizator norm;
    private final int WIDTH, HEIGHT;

    public RandomTriangleCanvas(int width, int height) {
        norm = new Normalizator(width, height);
        WIDTH = width;
        HEIGHT = height;
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        triangle = Triangle.generateRandom(0, 0, 320, 200);
        System.out.println(triangle);
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
        // TODO Auto-generated method stub

    }

    @Override
    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glBegin(GL2.GL_POINTS);

        gl.glEnd();

    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        // TODO Auto-generated method stub

    }

}