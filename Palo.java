public class Palo {
    private String simbolo;
    private Posicion posicion;

    public Palo(String simbolo, Posicion posicion) {
        this.simbolo = simbolo;
        this.posicion = posicion;
    }

    public void dibujar() {
               System.out.println("Dibujando palo " + simbolo + " en (" + posicion.getX() + ", " + posicion.getY() + ")");
    }
}
