package es.javier.learning.gfx.glCanvasLearn;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;

import es.javier.learning.gfx.model.CustomCanvas;
import es.javier.learning.gfx.model.Rectangle;
import es.javier.learning.gfx.model.Triangle;

public class RandomTriangleCanvas extends CustomCanvas {

    Triangle triangle;
    Rectangle s = new Rectangle(10, 10, 350, 350);
    
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

        gl.glEnd();

    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        // TODO Auto-generated method stub

    }

}