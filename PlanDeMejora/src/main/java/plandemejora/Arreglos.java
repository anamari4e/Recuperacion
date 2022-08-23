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
public class Arreglos {
    public static void main(String[] args) {
        System.out.println("Digite el número de episodio que quiera saber su duración: ");
        
        Scanner entrada=new Scanner(System.in);
        int episodio=entrada.nextInt();
        
        
        int[] duracion =new int[]{20,22,21,23,20};//Forma de crear un arreglo 
        int n =duracion.length;
        
        if (episodio>=0 && episodio <5){//Recordar que && es un operador "y" si se cumplen ambas funciones se continua con el ciclo
            int duracionI=duracion[episodio];//Se crea la variable "duracionI" esto con el fin de imprimir los datos contenidos del array duracion y se toma el Scanner llamado episodio para aclarecer que es el dato que ingreso el usuario.
            System.out.println("El tiempo de duración del episodio ingresado es de: "+duracionI+" minutos");
           }else{
               System.out.println("Error!!!!!!!!! \nLa serie tiene solo "+n+" episodios");
           }
    }
}
 //Forma de crear arreglo asignando posicion-Se puede cambiar el codigo a continuación por lo digitado en la linea #21
        /*int[] duracion =new int[5];//
        duracion[0]=20;//Recordar que se utilizan las posiciones del arreglo y siempre se empiza a contar desde la posicion 0 
        duracion[1]=22;//Posicion 1 
        duracion[2]=21;//Posicion 2 
        duracion[3]=23;//Posicion 3 
        duracion[4]=20;//Posicion 4 
        
        */
