/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plandemejora;

/**
 *
 * @author Ana Abril
 */
public class Metodos {
    public static void main(String[] args) {
        
        String[] titulos=new String []{"Ladybug","SuperCan","Barbie","Ladybug","Minions","Grachi","Scorpion","Brujillizas"};    
        
        
        play(titulos,1);//Se indica que vamos a utilizar los valores del arreglo titulos utilizando el indice 1, recordar las posiciones desde 0
        System.out.println("");
        pause();
    }
    public static void play(String[] titulos,int index) {
        
        if(index<titulos.length){
           String title=titulos[index];
            for(int i=0;i<5;i++){
                System.out.println("Reproduciendo pelicula..."+title);
            }    
        
        }else{
            System.out.println("Digite otro número por favor...");
        }        
    }
    public static void pause() {
        System.out.println("¡La pelicula esta pausada!");
        
    }
}