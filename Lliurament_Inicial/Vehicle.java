public class Vehicle {
    private String id;
    private String model;
    private int autonomiaKm;
    private int capacitatPassatgers;

    // Constructor
    public Vehicle(String id, String model, int autonomiaKm, int capacitatPassatgers) {
        this.id = id;
        this.model = model;
        this.autonomiaKm = autonomiaKm;
        this.capacitatPassatgers = capacitatPassatgers;
    }

    // Getters per accedir a la informació del vehicle
    public String getId() { return id; }
    public String getModel() { return model; }
    public int getAutonomiaKm() { return autonomiaKm; }
    public int getCapacitatPassatgers() { return capacitatPassatgers; }
}