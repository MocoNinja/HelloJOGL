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
        triangle = Triangle.generateRandom(0, 0, WIDTH, HEIGHT);
        System.out.println(triangle);
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        final GL2 gl = drawable.getGL().getGL2();
        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2d(norm.getNormX(triangle.getV1().getX()), norm.getNormY(triangle.getV1().getY()));
        gl.glVertex2d(norm.getNormX(triangle.getV2().getX()), norm.getNormY(triangle.getV2().getY()));
        gl.glEnd();

        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2d(norm.getNormX(triangle.getV2().getX()), norm.getNormY(triangle.getV2().getY()));
        gl.glVertex2d(norm.getNormX(triangle.getV3().getX()), norm.getNormY(triangle.getV3().getY()));
        gl.glEnd();

        gl.glBegin(GL2.GL_LINES);
        gl.glVertex2d(norm.getNormX(triangle.getV3().getX()), norm.getNormY(triangle.getV3().getY()));
        gl.glVertex2d(norm.getNormX(triangle.getV1().getX()), norm.getNormY(triangle.getV1().getY()));
        gl.glEnd();

        gl.glFlush();
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub

    }
}