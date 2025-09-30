// Registro de prototipos
class Registro {
    private Map<String, Prototype> prototypes = new HashMap<>();

    public void addPrototipo(String key, Prototype prototipo) {
        prototipo.put(key, prototipo);
    }

    public Prototype getPrototipo(String key) {
        return prototipo.get(key).clone();
    }
}
