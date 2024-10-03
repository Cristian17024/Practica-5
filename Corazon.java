public class Corazon {
    public void dibujar(Canvas canvas, int xPos, int yPos, String color) {
        // Dibujar los dos círculos
        Circle c1 = new Circle();
        c1.changeColor(color);
        c1.changeSize(30);
        c1.setPosition(xPos - 15, yPos - 15);
        c1.draw(canvas);

        Circle c2 = new Circle();
        c2.changeColor(color);
        c2.changeSize(30);
        c2.setPosition(xPos - 45, yPos - 15);
        c2.draw(canvas);

        // Dibujar el triángulo
        Triangle tri = new Triangle();
        tri.changeColor(color);
        tri.changeSize(30, 50);
        tri.setPosition(xPos - 25, yPos);
        tri.draw(canvas);
    }
}
