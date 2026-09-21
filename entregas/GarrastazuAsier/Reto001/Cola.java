public class Cola {

    private Persona[] personas;
    private int cantidad;

    public Cola() {
        personas = new Persona[30];
        cantidad = 0;
    }

    public boolean entrar(Persona persona) {

        if (cantidad == 30) {
            return false;
        }

        personas[cantidad] = persona;
        cantidad++;

        return true;
    }

    public Persona salir() {

        if (cantidad == 0) {
            return null;
        }

        Persona persona = personas[0];

        for (int i = 0; i < cantidad - 1; i++) {
            personas[i] = personas[i + 1];
        }

        personas[cantidad - 1] = null;
        cantidad--;

        return persona;
    }

    public boolean estaVacia() {
        return cantidad == 0;
    }

    public int obtenerCantidad() {
        return cantidad;
    }
}