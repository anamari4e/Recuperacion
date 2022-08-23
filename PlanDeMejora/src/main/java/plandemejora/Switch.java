/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plandemejora;

import java.util.Scanner;

/**
 *
 * @author Ana Abril
 */
public class Switch {
    public static void main(String[] args) {
        System.out.println("Digite en que día se encuentra:");
        Scanner entrada= new Scanner(System.in);
        
        int dia=entrada.nextInt();
        
        
        switch (dia){//El metodo switch es un facilitador, puesto que se puede utilizar como un menu y además tiene un parecido con un if-else pero sin tanta complejidad
            case 1:
                System.out.println("Es día de deporte");
                break;
        
       
            case 2:
                System.out.println("Es día de ocio");
                break;
        
        
            case 3:
                System.out.println("Es día de cine");
                break;
        
        
            case 4:
                System.out.println("Es día de terror");
                break;
        
       
            case 5:
                System.out.println("Es día de thriller");
                break;
        
        
            case 6:
                System.out.println("Es día de comedia");
                break;
        
        
            case 7:
                System.out.println("Es día de dormir");
                break;
        
         default:
         System.out.println("¿En qué día vives?");
        }
    }
}
