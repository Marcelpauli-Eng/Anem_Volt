public class Lloc {
    private String id;
    private String nom;
    private boolean esEstacioCarrega;
    private int capacitatCarrega;

    // Constructor
    public Lloc(String id, String nom, boolean esEstacioCarrega, int capacitatCarrega) {
        this.id = id;
        this.nom = nom;
        this.esEstacioCarrega = esEstacioCarrega;
        this.capacitatCarrega = capacitatCarrega;
    }

    // Getters
    public String getId() { return id; }
    public String getNom() { return nom; }
    public boolean esEstacioCarrega() { return esEstacioCarrega; }
    public int getCapacitatCarrega() { return capacitatCarrega; }
}