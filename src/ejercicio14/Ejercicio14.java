package ejercicio14;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su numero: ");
        double numero=leer.nextDouble();
        double cuadrado= Math.pow(numero,2);
        double cubo= Math.pow(numero,3);
        System.out.println("El cuadrado de su numero es: "+cuadrado);
        System.out.println("El cubo de su numero es: "+cubo);
    }
}