package es.javier.learning.gfx.model;

public class Rectangle {
    float width, height;
    float x, y;
    Vertex v0, v1, v2, v3;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        v0 = new Vertex(x,         y         );
        v1 = new Vertex(x + width, y         );
        v2 = new Vertex(x,         y + height);
        v3 = new Vertex(x + width, y + height);
    }

    public Rectangle(Vertex v0, Vertex v1, Vertex v2, Vertex v3) {
        this.x      = v0.getX();
        this.y      = v0.getY();
        this.width  = v1.getX() - v0.getX();
        this.height = v2.getY() - v0.getY();
        this.v0 = v0;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }


    public Vertex getV0() {
        return this.v0;
    }

    public Vertex getV1() {
        return this.v1;
    }

    public Vertex getV2() {
        return this.v2;
    }

    public Vertex getV3() {
        return this.v3;
    }

    public void move(float x, float y) {
        v0 = new Vertex(x,         y         );
        v1 = new Vertex(x + width, y         );
        v2 = new Vertex(x,         y + height);
        v3 = new Vertex(x + width, y + height);
    }

    public void resize(float width, float height) {
        this.width = width;
        this.height = height;
        v0 = new Vertex(x,         y         );
        v1 = new Vertex(x + width, y         );
        v2 = new Vertex(x,         y + height);
        v3 = new Vertex(x + width, y + height);
    }

    @Override
    public String toString() {
        return "Rectangle {" +
            " v0='" + getV0() + "'" +
            ", v1='" + getV1() + "'" +
            ", v2='" + getV2() + "'" +
            ", v3='" + getV3() + "'" +
            "}";
    }

}