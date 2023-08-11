package Objeto;

public class Main {
    public static void main(String[] args) {
        Persona persona1= new Persona();
        persona1.setNombre("Maria");
        persona1.setEdad(10);
        persona1.setIdentificacion("PT1020228");
        persona1.mostrar();
        persona1.esMayorDeEdad();
    }
}


