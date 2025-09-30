public class Main {
    public static void Main(String[]args) {
        System.out.println("Creando los prototipos");
        long start = System.currentTimeMillis();
        registry.addPrototype("fibra", new Fibra());
        registry.addPrototype("movil", new Movil());
        registry.addPrototype("fusion", new ClienteFusion());
        registry.addPrototype("nuevo", new NuevoCliente());

        long end = System.currentTimeMillis();
        System.out.println("Tiempo en crear prototipos:" + (end - start) + "ms/n");

        System.out.println("Clonando prototipos");

        start = System.currentTimeMillis();
        Prototype cliente1 = registro.getClone("fibra");
        cliente1.username = "Carla Lazon";
        cliente1.offers.add("GB ilimitados");

        Prototype cliente2 = registro.getClone("fusion");
        cliente1.username = "Clara Alvarez";
        cliente1.offers.add("Promo futbol para estudiantes");
        end = System.currentTimeMillis();

        System.out.println(("Tiempo en clonar:" + (end - start) + "ms/n"););

        System.out.println("Clienta Carla (clon de Fibra): \n"+ cliente1);
        System.out.println("Clienta Clara (clon de Fusion): \n"+ cliente2);

    }
}