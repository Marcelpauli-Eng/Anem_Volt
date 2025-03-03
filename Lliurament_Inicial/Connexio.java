public class Connexio {
    private Lloc origen;
    private Lloc desti;
    private double distanciaKm;
    private int tempsMin;

    // Constructor
    public Connexio(Lloc origen, Lloc desti, double distanciaKm, int tempsMin) {
        this.origen = origen;
        this.desti = desti;
        this.distanciaKm = distanciaKm;
        this.tempsMin = tempsMin;
    }

    // Getters
    public Lloc getOrigen() { return origen; }
    public Lloc getDesti() { return desti; }
    public double getDistanciaKm() { return distanciaKm; }
    public int getTempsMin() { return tempsMin; }
}