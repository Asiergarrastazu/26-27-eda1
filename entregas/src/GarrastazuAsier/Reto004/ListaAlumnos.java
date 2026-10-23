package GarrastazuAsier.Reto004;

public class ListaAlumnos {
    private Nodo primero;

    public ListaAlumnos(){
        this.primero = null;
    }

    public void encolar(String dato){
        Nodo nuevoNodo= new Nodo(dato);
        
        if (primero == null){
            primero = nuevoNodo;
        
        }else{
            Nodo actual = primero;
            
            while (actual.getSiguiente() != null){
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void mostrarLista(){
        Nodo actual = primero;

        while (actual != null){
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
    
}
