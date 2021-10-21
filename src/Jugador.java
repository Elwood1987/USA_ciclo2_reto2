public class Jugador extends Personaje {
    private int numeroBotiquines;

    public Jugador(String nombre, char sexo, double posicionX, double pisicionY) {
        super(nombre, sexo, posicionX, pisicionY);
    }

    public void moverDerecha(double d){

    }
    public void moverIzquierda(double d){

    }
    public void moverArriba(double d){

    }
    public void moverAbajo(double d){

    }

    public void recogerBotiquin(){

    }

    public void golpearEnemigo(){

    }

    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }
}
