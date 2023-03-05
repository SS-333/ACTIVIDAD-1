package ejercicio17;
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo: ");
        double radio=leer.nextDouble();
        double area=Math.PI*Math.pow(radio, 2);
        double circunferencia=2*Math.PI*radio;
        System.out.println("El area del circulo es: "+area);
        System.out.println("La longitud de la circunferencia del circulo es: "+circunferencia);
    }
}