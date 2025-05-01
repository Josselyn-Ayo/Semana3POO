import java.util.Scanner;
class Cocinero{
    String nombre;
    int experiencia;
    String especialidad;
    public Cocinero(String nombre, int experiencia, String especialidad){
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }
    public Cocinero(){}
    public void leerDatos(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el nombre del  cocinero");
        nombre = input.nextLine();
        System.out.println("Ingrese la especialidad del cocinero");
        especialidad = input.nextLine();
        System.out.println("Ingrese la experiencia del cocinero");
        experiencia = input.nextInt();
        System.out.println("----------------------------------");
    }
    public void mostrarInf(){
        System.out.println("Nombre es " + nombre);
        System.out.println("Especialidad " + especialidad);
        System.out.println("El año de experiencia " + experiencia);
    }
    }


public class Main {
    public static void main(String[] args) {
        Cocinero cocinero1 = new Cocinero();
        Cocinero cocinero2 = new Cocinero();
        Cocinero cocinero3= new Cocinero();
        cocinero1.leerDatos();
        cocinero2.leerDatos();
        cocinero3.leerDatos();
        cocinero1.mostrarInf();
        cocinero2.mostrarInf();
        cocinero3.mostrarInf();

    }

}