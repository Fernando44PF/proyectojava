package herencia;



public class Principal{

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Geo","lovera",23,123,15);
    
        estudiante.mostrarDatos();


        estudiante.comer();
    }

}