public class Main {
    public static void Main(String[]args) {
        System.out.println("Creando los prototipos");
        long start = System.currentTimeMillis();
        registry.addPrototype("fibra", new Fibra());
        registry.addPrototype("movil", new Movil());
        registry.addPrototype("fusion", new

    }
}