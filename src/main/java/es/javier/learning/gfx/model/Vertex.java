package es.javier.learning.gfx.model;

public class Vertex {
    private float x, y;

    public Vertex(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vertex(int x, int y) {
        this.x = Math.round(x);
        this.y = Math.round(y);
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return "VERTEX {" +
            " x='" + getX() + "'" +
            ", y='" + getY() + "'" +
            "}";
    }

}