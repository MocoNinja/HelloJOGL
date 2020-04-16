package es.javier.learning.gfx.utils;

public class Normalizator {
    private final int WIDTH, HEIGHT;

     /*
    YO PIENSO:

    (0, 0)+++++++++++++++(WIDTH/2, 0)+++++++++++++++(WIDTH,0)
    |                                                       |
    |                                                       |
    |                                                       |
    |                                                       |
    (0, HEIGHT / 2)++++++(WIDTH/2, HEIGHT / 2)++++++(WIDTH,0)
    |                                                       |
    |                                                       |
    |                                                       |
    |                                                       |
    (0, HEIGHT)+++++++(WIDTH/2, HEIGHT)++++++++(WIDTH,HEIGHT)


    Esta mierda piensa:

    (-1, -1)+++++++++++++++++(0, -1)++++++++++++++++++(1, -1)
    |                                                       |
    |                                                       |
    |                                                       |
    |                                                       |
    (-1, 0)++++++++++++++++++(0, 0)++++++++++++++++++++(1, 0)
    |                                                       |
    |                                                       |
    |                                                       |
    |                                                       |
    (-1, 1)++++++++++++++++++(0, 1)++++++++++++++++++++(1, 1)
    */
    // ENTONCES PARA CONVERTIR UN VALOR MIO A LA MIERDA DE ABAJO,
    // DEBO MULTIPLICARLO POR 2, DIVIDIRLO POR LA MAGNITUD Y RESTARLE 1
    public Normalizator(int width, int height) {
        WIDTH = width;
        HEIGHT = height;
    }

    public float getNormX(float x) {
        float value = (2 * x / WIDTH) - 1;
        System.out.println("Normalizado: " + x + " a: " + value);
        return value;
    }

    public float getNormY(float y) {
        float value = (2 * y / HEIGHT) - 1;
        System.out.println("Normalizado: " + y + " a: " + value);
        return value;
    }

    public int getWidth() {
        return WIDTH;
    }

    public int getHeight() {
        return HEIGHT;
    }
}