 

import java.util.Scanner;
public class Proyecto {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int slc1 = 0;
   int a1 = 0;
   int num = 1;
   int i=0;
   System.out.println("===Seleciona una opcion===");
   System.out.println("Calcular el Factorial de un numero 1");
   System.out.println("Ordenar numeros 2 ");
   System.out.println("Numeros primos 3 ");
   System.out.println("Vocales 4 ");
   slc1=sc.nextInt();
   //Primer programa
   if(slc1 == 1){
     System.out.println("Ingrese un numero entero : ");
     a1 = sc.nextInt();
     for(i=1;i<=a1;i++){
       num = (num * i);
     }
     System.out.println("El factorial es : "+ num);
     //Segundo Programa
    }else if(slc1 == 2){
       int arl[]= new int[10];
       for(i=0;i<10;i++){
           System.out.println("Ingrese el valor "+(i+1));
           arl[i]=sc.nextInt();
        }
        for(i=0;i<10;i++){
            for(a1=i+1;a1<10;a1++){
                if(arl[i]<arl[a1]){
                    num=arl[i];
                    arl[i]=arl[a1];
                    arl[a1]=num;
                }
            }
        }
       System.out.println("Los numeros ordenados de mayor a menor : ");
       for(i=0;i<10;i++){
           System.out.print(arl[i] +", ");
        }
    }else if(slc1==3){
        
    }
  }
}