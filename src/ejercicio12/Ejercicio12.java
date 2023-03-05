package ejercicio12;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
           double retencion=12.5;
           
           System.out.println("Ingrese las horas trabajadas: ");
           double horas=leer.nextDouble();
           
           System.out.println("Ingrese el valor de la hora: ");
           double valor=leer.nextDouble();
           double salariobruto=horas*valor;
           double retencionfinal=salariobruto*retencion/100;
           double salarioneto=salariobruto-retencionfinal;
           
           System.out.println("El salario bruto es: $"+salariobruto);
           System.out.println("La retencion en la fuente es: $"+retencionfinal);
           System.out.println("El salario neto es: $"+salarioneto);    
    }
}