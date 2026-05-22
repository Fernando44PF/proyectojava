package herencia;


public class Estudiante extends Persona {

    private int codigoestudiante;
    private float notafinal;


    public Estudiante(String nombre,String apellido,int edad,int codigoestudiante,float notafinal){

        super(nombre, apellido, edad);
        this.codigoestudiante=codigoestudiante;
        this.notafinal = notafinal;
    }



    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
    "\nApellido: "+ getApellido());
    }


    public void comer(){
        System.out.println("estoy comiendo como estudiante");
    }

}