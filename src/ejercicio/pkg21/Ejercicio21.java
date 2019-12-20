/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg21;

import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int Num, Cont, Res;
  
         
  Num = 2; //el uno no cuenta
  System.out.print("Los números primos desde 1 hasta 100 son:");
  
    while(Num <= 100)
    {
       Res=1;
       Cont=0;
       while(Res<=Num)
       {
         if((Num%Res) == 0)
           {
               Cont++;
           }  
         Res++;    
       }
     
        if(Cont <= 2)
        {
            System.out.print(" " + Num);
            System.out.print(" ");
        }
        Num++;
    }
  }
}
    

