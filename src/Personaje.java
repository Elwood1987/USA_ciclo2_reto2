public class Personaje {

    private String nombre;
    private char sexo;
    private double posicionX;
    private double pisicionY;
    private double damage;
    private double vida;

    public Personaje(String nombre, char sexo, double posicionX, double pisicionY, double damage) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.posicionX = posicionX;
        this.pisicionY = pisicionY;
        this.damage = damage;
        this.vida = 100;
    }

    public void golpear(Personaje personaje){
        personaje.setVida(10);
    }

    public void recibirImpacto(double impacto){

    }

    public void calcularDistanciaRespectoPersonaje(Personaje personaje){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPisicionY() {
        return pisicionY;
    }

    public void setPisicionY(double pisicionY) {
        this.pisicionY = pisicionY;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
}
