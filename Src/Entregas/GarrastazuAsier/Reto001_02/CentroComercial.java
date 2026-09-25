package Src.Entregas.GarrastazuAsier.Reto001_02;

public class CentroComercial {
    public static void main(String[] args) {

        Fila fila = new Fila();

        for (int minuto = 0; minuto < 240; minuto++){
            
            if (Math.random()< 0.6){
                fila.añadirCliente();
            }

            if (Math.random() < 0.4){
                fila.atenderCliente();
            }
        }

    }

}
