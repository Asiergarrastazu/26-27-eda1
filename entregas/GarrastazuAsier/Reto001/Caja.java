public class Caja {

    private Persona persona;

    public Caja() {
        persona = null;
    }

    public boolean estaLibre() {
        return persona == null;
    }

    public void atender(Persona persona) {
        this.persona = persona;
    }

    public boolean pasarUnProducto() {

        if (persona == null) {
            return false;
        }

        persona.pasarProducto();

        if (persona.haTerminado()) {
            persona = null;
            return true;
        }

        return false;
    }
}
