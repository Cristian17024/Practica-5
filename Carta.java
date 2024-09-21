public class Carta {
    public enum Palo {
        CORAZONES,
        DIAMANTES,
        TREBOLES,
        PICAS
    }
    private int valor; 
    private Palo palo;
    public Carta(int valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }
    @Override
    public String toString() {
        String valorRepresentacion;
        switch (valor) {
            case 1:
                valorRepresentacion = "A";
                break;
            case 11:
                valorRepresentacion = "J";
                break;
            case 12:
                valorRepresentacion = "Q";
                break;
            case 13:
                valorRepresentacion = "K";
                break;
            default:
                valorRepresentacion = String.valueOf(valor);
        }
        return valorRepresentacion + " de " + palo;
    }
    public int getValor() {
        return valor;
    }
    public Palo getPalo() {
        return palo;
    }
    public static void main(String[] args) {
        Carta carta1 = new Carta(1, Palo.CORAZONES);  
        Carta carta2 = new Carta(11, Palo.PICAS);    
        Carta carta3 = new Carta(13, Palo.TREBOLES); 
        Carta carta4 = new Carta(7, Palo.DIAMANTES);  
        System.out.println(carta1);  
        System.out.println(carta2);  
        System.out.println(carta3);  
        System.out.println(carta4);  
    }
}
