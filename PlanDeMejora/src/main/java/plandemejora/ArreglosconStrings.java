/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plandemejora;

/**
 *
 * @author Ana Abril
 */
public class ArreglosconStrings {
    public static void main(String[] args) {
        String[] titulos=new String []{"Ladybug","SuperCan","Barbie","Ladybug","Minions","Grachi","Scorpion","Brujillizas"};    
        for(String title:titulos){//Se utiliza para iterar sobre la variable titulos, es decir evitar todo el codigo que se plantea en el for usualmente
            if(!title.contains("a")){//Se utiliza el operador de diferencia para decir que si el titulo contiene la letra a, omitirlo e imprimir los otros datos
                System.out.println(title);
            }
            
        }
    }
}
