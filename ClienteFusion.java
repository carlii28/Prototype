// Subclase para cliente Fusión
class ClienteFusion extends Prototype {
    public ClienteFusion() {
        super("Fusión");
        menu.add("Internet + Móvil");
        menu.add("TV Premium");
        offers.add("Pack Fusión con Netflix incluido");
        banners.add("¡Lo tienes todo en Fusión!");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== Experiencia Fusión ===");
        System.out.println("Usuario: " + username);
        System.out.println("Menú: " + menu);
        System.out.println("Ofertas: " + offers);
        System.out.println("Banners: " + banners);
    }
}
