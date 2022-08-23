/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package plandemejora2;

/**
 *
 * @author Ana Abril
 */
public class PlanDeMejora2 {

    public static void main(String[] args) {
      //Metodos en Java
      
    movie minions=new movie("Minions","Cartoons",70);    
    movie backToTheFuture = new movie("Back to the future","Science Fiction",180);
    movie toyStory = new movie("Toy Story","familiar",90);
    movie starWars = new movie ("star Wars", "ciencia ficcion", 180);
    
    starWars.play();//Estos metodos son llamados desde movie que es donde se asigno lo que se iba a ejecutar.
    starWars.paused();
    toyStory.play();
    
    int toyStoryTotalframes = toyStory.getTotalframes();
    
        System.out.println("Total Frames: " + toyStoryTotalframes);

     
            }
}
