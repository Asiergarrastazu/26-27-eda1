public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona(3);
        Persona persona2 = new Persona(5);
        Persona persona3 = new Persona(2);
        Persona persona4 = new Persona(4);

        Cola cola = new Cola();

        cola.entrar(persona1);
        cola.entrar(persona2);
        cola.entrar(persona3);
        cola.entrar(persona4);

        System.out.println("Personas en la cola: " + cola.obtenerCantidad());

        Caja caja = new Caja();

        Persona personaAtendida = cola.salir();

        caja.atender(personaAtendida);

        System.out.println("Personas en la cola: " + cola.obtenerCantidad());

        for (int minuto = 1; minuto <= 3; minuto++) {

            caja.pasarUnProducto();

            System.out.println(
                "Minuto " + minuto +
                " - Productos restantes: " +
                persona.obtenerProductosRestantes()
            );
        }

        System.out.println("¿La caja está libre? " + caja.estaLibre());
    }
}