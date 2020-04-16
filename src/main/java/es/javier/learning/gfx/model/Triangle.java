package es.javier.learning.gfx.model;

import java.util.Random;

public class Triangle {
    private Vertex v1, v2, v3;

    public Triangle(final Vertex v1, final Vertex v2, final Vertex v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public static Triangle generateRandom(final int minX, final int minY, final int maxX, final int maxY) {
        final Random rand = new Random();
        int v1X = rand.nextInt(maxX - minX) + minX;
        int v1Y = rand.nextInt(maxY - minY) + minY;
        int v2X = rand.nextInt(maxX - minX) + minX;
        int v2Y = rand.nextInt(maxY - minY) + minY;
        int v3X = rand.nextInt(maxX - minX) + minX;
        int v3Y = rand.nextInt(maxY - minY) + minY;
        Vertex 
            v1 = new Vertex(v1X, v1Y),
            v2 = new Vertex(v2X, v2Y),
            v3 = new Vertex(v3X, v3Y);
        return new Triangle(v1, v2, v3);
    }
    public Vertex getV1() {
        return this.v1;
    }

    public void setV1(final Vertex v1) {
        this.v1 = v1;
    }

    public Vertex getV2() {
        return this.v2;
    }

    public void setV2(final Vertex v2) {
        this.v2 = v2;
    }

    public Vertex getV3() {
        return this.v3;
    }

    public void setV3(final Vertex v3) {
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "TRIANGLE {" +
            " v1='" + getV1() + "'" +
            ", v2='" + getV2() + "'" +
            ", v3='" + getV3() + "'" +
            "}";
    }

}