package GarrastazuAsier.Reto004;

public class Recuento {
    private int[] votosCandidatos;
    private int votosBlancos;
    private int votosNulos;

    public Recuento(int numeroCandidatos) {
        votosCandidatos = new int[numeroCandidatos];
        votosBlancos = 0;
        votosNulos = 0;
    }

    public void contarVoto(Voto voto, Candidato[] candidatos) {
        String nombre = voto.getCandidato();

        if (nombre == null || nombre.trim().isEmpty()) {
            votosBlancos++;
            return;
        }

        for (int i = 0; i < candidatos.length; i++) {
            if (candidatos[i] != null &&
                candidatos[i].getNombre().equalsIgnoreCase(nombre)) {
                votosCandidatos[i]++;
                return;
            }
        }

        votosNulos++;
    }

    public void mostrarResultados(Candidato[] candidatos) {
        System.out.println("=== RESULTADOS ELECTORALES ===");

        for (int i = 0; i < candidatos.length; i++) {
            if (candidatos[i] != null) {
                System.out.println(
                    candidatos[i].getNombre() + ": "
                    + votosCandidatos[i] + " votos"
                );
            }
        }

        System.out.println("Votos en blanco: " + votosBlancos);
        System.out.println("Votos nulos: " + votosNulos);
    }
}