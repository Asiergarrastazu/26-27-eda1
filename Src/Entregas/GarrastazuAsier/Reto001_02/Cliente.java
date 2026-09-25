package Src.Entregas.GarrastazuAsier.Reto001_02;

public class Cliente {
    private Cliente siguiente;

    public Cliente(){
        siguiente = null;
    }
    
    public Cliente getSiguiente(){
        return siguiente;
    }
    
    public void setSiguiente(Cliente siguiente){
        this.siguiente = siguiente;
    }

}
