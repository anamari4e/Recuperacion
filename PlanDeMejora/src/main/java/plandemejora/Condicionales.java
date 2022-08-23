/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plandemejora;

/**
 *
 * @author Ana Abril
 */
public class Condicionales {
    public static void main(String[] args) {
        
        //Disney+
        
        int numEpisodios=2;
        int temporadas=3;
        
        
     
        
        if (numEpisodios>1 || temporadas>1 ){//Operador or= ||
            System.out.println("Es una miniserie");
        } else if(numEpisodios>10){
            System.out.println("Es una serie");
        } else if(numEpisodios==1){
            System.out.println("Es una pelicula");
        } else{
            System.out.println("Debe tener al menos un episodio");
        }
        
        System.out.println("-----------------------------------------------------------------------------------------------");
        //Ciclo while
        int i=0;
        int tiempo=10;
        
        while(i<=tiempo){//En caso de que la condicion no se cumpla nunca va a entrar al ciclo
             if(i<1){
                System.out.println("Reproduciendo intro while, segundo "+i);     
            }
             else if(i<7){
                 System.out.println("Reproduciendo while, segundo "+i);
             }
             else{
                 System.out.println("Reproduciendo while, segundo "+i);
             }
            i=i+1; 
                    //Se incrementa la variable i para que el ciclo cumpla en algún momento el ciclo.
        }
       
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
         for(int j=0;j<tiempo;j++){//Se crea la variable j y se dice que mientras j sea menor que la duracion de la pelicula "tiempo", y se establece como cambiara la variable que está al principio en este caso aumentará o se sumará uno
            if(j<1){
                System.out.println("Reproduciendo intro for, segundo "+i);     
            }
             else if(j<7){
                 System.out.println("Reproduciendo pelicula for, segundo "+i);
             }
             else{
                 System.out.println("Reproduciendo creditos for, segundo "+i);
             }
        }
       System.out.println("---------------------------------------------------------------------------------------------------------");
            
       int k=0;
       
       do{//Entra al menos una vez en el ciclo porque la condicion se evalua hasta el final
           if(k<3){
                System.out.println("Reproduciendo intro do-while, segundo "+i);     
            }
             else if(k<7){
                 System.out.println("Reproduciendo do-while, segundo "+i);
             }
             else{
                 System.out.println("Reproduciendo do-while, segundo "+i);
             }
           k++;//Recordar aumentar la variable para que el ciclo no se vuelva infinito
       }while(k<=tiempo);
        
                
    }
}
