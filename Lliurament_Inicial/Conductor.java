public class Conductor {
    private String id;
    private String nom;
    private String estrategia;
    private Vehicle vehicleAssignat;

    // Constructor
    public Conductor(String id, String nom, String estrategia, Vehicle vehicleAssignat) {
        this.id = id;
        this.nom = nom;
        this.estrategia = estrategia;
        this.vehicleAssignat = vehicleAssignat;
    }

    // Getters
    public String getId() { return id; }
    public String getNom() { return nom; }
    public String getEstrategia() { return estrategia; }
    public Vehicle getVehicleAssignat() { return vehicleAssignat; }
}