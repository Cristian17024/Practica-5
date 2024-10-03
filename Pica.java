public class Pica {
    public void dibujar(Canvas canvas, int xPos, int yPos, String color) {
        
        Triangle tri1 = new Triangle();
        tri1.changeColor(color);
        tri1.changeSize(30, 50);
        tri1.setPosition(xPos - 25, yPos - 40);
        tri1.draw(canvas);
        
        Triangle tri2 = new Triangle();
        tri2.changeColor("white");
        tri2.changeSize(15, 25);
        tri2.setPosition(xPos - 12, yPos - 25);
        tri2.draw(canvas);
    }
}
