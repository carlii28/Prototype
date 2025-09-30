class Fibra extends Prototype {
    public Fibra() {
        super("Fibra");
        menu.add("Planes de Internet");
        menu.add("Routers");
        menu.add("TV");
        offers.add("50% descuento 6 meses");
        banners.add("Bienvenido a Fibra Movistar");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== Experiencia Fibra ===");
        System.out.println("Usuario: " + username);
        System.out.println("Menú: " + menu);
        System.out.println("Ofertas: " + offers);
        System.out.println("Banners: " + banners);
    }
}
