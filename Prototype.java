import java.util.*;

// Clase abstracta que representa el prototipo base
abstract class Prototype implements Cloneable {
    protected String username;
    protected String planType;
    protected List<String> menu;
    protected List<String> offers;
    protected List<String> banners;

    // Constructor
    public Prototype(String planType) {
        this.planType = planType;
        this.menu = new ArrayList<>();
        this.offers = new ArrayList<>();
        this.banners = new ArrayList<>();

        // Simulación de inicialización costosa
        try {
            System.out.println("Inicializando experiencia " + planType + "...");
            Thread.sleep(2000); // Simula carga pesada desde backend
            System.out.println("Datos cargados para experiencia " + planType + "!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Método abstracto para mostrar info
    public abstract void mostrarInfo();

    // Getters y setters
    public void setUsername(String username) { this.username = username; }
    public void setOffers(List<String> offers) { this.offers = offers; }
    public void setBanners(List<String> banners) { this.banners = banners; }

    // Implementación de clone
    @Override
    public Prototype clone() {
        try {
            Prototype clone = (Prototype) super.clone();
            clone.menu = new ArrayList<>(this.menu);
            clone.offers = new ArrayList<>(this.offers);
            clone.banners = new ArrayList<>(this.banners);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}