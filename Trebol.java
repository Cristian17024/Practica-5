public class Trebol {
    public void dibujar(Canvas canvas, int xPos, int yPos, String color) {
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

        Circle c3 = new Circle();
        c3.changeColor(color);
        c3.changeSize(30);
        c3.setPosition(xPos - 30, yPos - 45);
        c3.draw(canvas);

        Square tallo = new Square();
        tallo.changeColor(color);
        tallo.changeSize(20);
        tallo.setPosition(xPos - 25, yPos);
        tallo.draw(canvas);
    }
}
