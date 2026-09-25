package Src.Entregas.GarrastazuAsier.Reto001_02;


public class Fila {
    
    private Cliente primero;
    private Cliente ultimo;
    private int cantidad;

    public Fila(){
        primero = null;
        ultimo = null;
        cantidad = 0;
    }
    
    public void añadirCliente(){

        Cliente nuevo = new Cliente();
        
        if (cantidad == 0){
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;

        }

        cantidad++;
    }

    public void atenderCliente(){

        if (cantidad > 0){
            primero = primero.getSiguiente();
            cantidad--;
        } else {
            System.out.println("No hay clientes en la fila.");
        }
    }


}
