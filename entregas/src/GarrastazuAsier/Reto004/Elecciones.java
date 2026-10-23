package GarrastazuAsier.Reto004;


import java.util.ArrayList;

public class Eleccion {

    private ListaAlumnos censo;
    private ArrayList<Candidato> candidatos;
    private ColaVotos urna;
    private Recuento recuento;
    private boolean abierta;

    public Eleccion() {
        censo = new ListaAlumnos();
        candidatos = new ArrayList<Candidato>();
        urna = new ColaVotos();
        recuento = null;
        abierta = false;
    }
}
