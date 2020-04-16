package es.javier.learning.gfx.model;

import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;

public abstract class CustomCanvas implements GLEventListener {
    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        System.out.println("RESHAPE");
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
        System.err.println("No debería ser tu método de limpiar algo más complejo que sacar este mensaje de error, blyat??!!");
    }

    public abstract void update();
}