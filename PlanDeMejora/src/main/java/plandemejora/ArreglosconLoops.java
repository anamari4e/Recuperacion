/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plandemejora;

/**
 *
 * @author Ana Abril
 */
public class ArreglosconLoops {
    public static void main(String[] args) {
        int[] duracionEpisodio=new int[]{20,22,21,23,22};//Se crea el array
        int n=duracionEpisodio.length;
        int temporadaDuracion=0;
        
        for (int i=0;i<n;i++){
            temporadaDuracion+=duracionEpisodio[i];//Se simplifica la operacion con el fin de indicar que el valor de temporadaDuracion sera sumada con la duracionEpisodio
        }
        System.out.println(temporadaDuracion);
    }
}
