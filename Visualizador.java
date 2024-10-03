public class Visualizador {

    public static void carta(Carta c, Posicion p) {
        System.out.println("Dibujando carta " + c.getValor() + " en posición (" + p.getX() + ", " + p.getY() + ")");

        c.getPalo().dibujar();
    }

    public static void dibujarFigura(Square figura, Posicion p) {
        figura.moveTo(p.getX(), p.getY());
    }
}
