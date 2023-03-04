package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");  
        int edjuan= leer.nextInt();
        
        int edalberto= 2*edjuan/3;
        int edana=4*edjuan/3;
        int edmama= edjuan+edana+edalberto;
        
        System.out.println("La edad de Juan es: "+edjuan);
        System.out.println("La edad de Alberto es: "+edalberto);
        System.out.println("La edad de Ana: "+edana);
        System.out.println("La edad de la Mama es: "+edmama);   
    }
}
