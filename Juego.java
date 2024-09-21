import java.util.List;

public class Juego {
    public static void main(String[] args) {

        Mazo mazo = new Mazo();
        System.out.println(mazo.obtenerCartasDisponibles());

        mazo.barajar();
        System.out.println("Mazo barajado:");
        System.out.println(mazo.obtenerCartasDisponibles());

        Jugador jugador1 = new Jugador("Torres");
        Jugador jugador2 = new Jugador("Vili");

        List<Carta> cartasJugador1 = mazo.repartirCartas(5);
        List<Carta> cartasJugador2 = mazo.repartirCartas(5);

        jugador1.recibirCartas(cartasJugador1);
        jugador2.recibirCartas(cartasJugador2);

        System.out.println("Cartas de Torres:");
        System.out.println(jugador1.informacionJugador());

        System.out.println("Cartas de Vili:");
        System.out.println(jugador2.informacionJugador());

        System.out.println("Cartas restantes en el mazo:");
        System.out.println(mazo.obtenerCartasDisponibles());

        Carta cartaDevuelta = cartasJugador1.get(0);
        mazo.devolverCarta(cartaDevuelta);
        jugador1.descartarCarta(cartaDevuelta);
        System.out.println("Torres devuelve una carta: " + cartaDevuelta);

        System.out.println("Cartas de Torres después:");
        System.out.println(jugador1.informacionJugador());

        System.out.println("Cartas restantes en el mazo después de devolver la carta:");
        System.out.println(mazo.obtenerCartasDisponibles());


    }
}
