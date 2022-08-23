/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plandemejora2;

/**
 *
 * @author Ana Abril
 */
public class movie {
    String name;
    String genero;
    int duracion;

    public movie(String name, String genero, int duracion) {
        this.name = name;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String getName() {
        return name;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

      public void play(){
             System.out.println("Viendo pelicula: " + name );

     }
         public void paused (){
             System.out.println("paused movie: " + name );
    }
         public int getTotalframes(){
            return this.duracion*60*60; 
         }

}


