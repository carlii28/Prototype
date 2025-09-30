public class Main {
    public static void main(String[] args) {
        Registro registro = new Registro();

        System.out.println("Creando prototipos...");
        long start = System.currentTimeMillis();

        registro.addPrototipo("fibra", new Fibra());
        registro.addPrototipo("movil", new Movil());
        registro.addPrototipo("fusion", new ClienteFusion());
        registro.addPrototipo("nuevo", new NuevoCliente());

        long end = System.currentTimeMillis();
        System.out.println("Tiempo en crear prototipos: " + (end - start) + "ms\n");

        System.out.println("Clonando prototipos...");
        start = System.currentTimeMillis();

        Prototype cliente1 = registro.getPrototipo("fibra");
        cliente1.username = "Carla Lazon";
        cliente1.offers.add("GB ilimitados");

        Prototype cliente2 = registro.getPrototipo("fusion");
        cliente2.username = "Clara Alvarez";
        cliente2.offers.add("Promo futbol para estudiantes");

        end = System.currentTimeMillis();
        System.out.println("Tiempo en clonar: " + (end - start) + "ms\n");

        System.out.println("Clienta Carla (clon de Fibra): ");
        cliente1.mostrarInfo();

        System.out.println("Clienta Clara (clon de Fusion): ");
        cliente2.mostrarInfo();
    }
}
