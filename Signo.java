
/**
 * Write a description of class Signo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Signo
{
    public static void main (String [] args){
        double a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        a=sc.nextDouble();
        if(a>0){
            System.out.println("El numero es positivo");
        }else if(a<0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es cero");
        }
    
    
    }
}
