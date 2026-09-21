public class Persona {

    private int productosRestantes;

    public Persona(int numeroProductos) {
        productosRestantes = numeroProductos;
    }

    public int obtenerProductosRestantes() {
        return productosRestantes;
    }

    public void pasarProducto() {
        productosRestantes--;
    }
}
