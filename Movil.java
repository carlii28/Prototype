// Subclase para cliente Móvil
class Movil extends Prototype {
    public Movil() {
        super("Móvil");
        menu.add("Planes móviles");
        menu.add("Smartphones");
        offers.add("Tarifa ilimitada");
        banners.add("Movistar Móvil siempre contigo");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== Experiencia Móvil ===");
        System.out.println("Usuario: " + username);
        System.out.println("Menú: " + menu);
        System.out.println("Ofertas: " + offers);
        System.out.println("Banners: " + banners);
    }
}
