// Subclase para cliente nuevo
class NuevoCliente extends Prototype {
    public NuevoCliente() {
        super("Nuevo Cliente");
        menu.add("Bienvenida");
        menu.add("Ofertas iniciales");
        offers.add("3 meses gratis en tu primer plan");
        banners.add("¡Bienvenido a Movistar!");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== Experiencia Nuevo Cliente ===");
        System.out.println("Usuario: " + username);
        System.out.println("Menú: " + menu);
        System.out.println("Ofertas: " + offers);
        System.out.println("Banners: " + banners);
    }
}
