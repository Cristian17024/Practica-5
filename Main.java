public class Main {
    public static void main(String[] args) {
      /*  Square square = new Square();
        square.changeColor("blue");
        square.makeVisible();
        Circle circle = new Circle();
        circle.changeColor("red");
        circle.makeVisible();
        Person person = new Person();
        person.changeColor("green");
        person.makeVisible();
        */
        Posicion posCarta = new Posicion(100, 200);
        Palo corazon = new Palo("♥", new Posicion(120, 220));
        Carta carta = new Carta("A", corazon);
        
        Visualizador.carta(carta, posCarta);
        Cuadrado cuadrado = new Cuadrado(50, 150, 150);
        Visualizador.dibujarFigura(cuadrado, new Posicion(150, 150));
    }
}
