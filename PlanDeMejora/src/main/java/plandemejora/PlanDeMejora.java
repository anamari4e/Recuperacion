/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package plandemejora;

/**
 *
 * @author Ana Abril
 */
public class PlanDeMejora {

    public static void main(String[] args) {
        
        System.out.println("Hola mundo, ya soy programador JAVA!");
        
        
        //Variables en JAVA
        /*Puede haber varios tipos como lo son int,float,double,String,boolean,long,char.*/
       
        int edad=19;
        System.out.println("Mi edad es: "+edad);
        
        float altura=1.70f;//Si no se coloca la f al final es porque JAVA no sabe que el valor es de tipo flotante 
        System.out.println("Mi altura es: "+altura);
        
        double valorDePi=3.141592;
        System.out.println("El valor de PI es: "+valorDePi);
        
        long distanciaAlSol=5072021;//Si se pone más números al final colocamos la "l" como se vio en el ejemplo del float
        System.out.println("La distancia al sol es de: "+distanciaAlSol);
        
        boolean tomaAgua=false;
        System.out.println("¿Toma Café?"+tomaAgua);
        
        char miInicial='a';//Solo es posible tener un caracter.
        System.out.println("Mi inicial es: "+miInicial+"\n");
        
        System.out.println("Trabajo con String:"+"\n");
        
        String saludo="Hola soy Ana Abril, y ahora soy una desarrolladora de JAVA \n";
        int longitud=saludo.length();//Se esta buscando la longitud del String saludo   
        System.out.println("La longitud del saludo es de: "+longitud+"\n");
        
        boolean stringVacio=saludo.isEmpty();//Un boolean por si la variable saludo esta vacía 
        System.out.println("¿Esta vacío la String de saludo?"+stringVacio+"\n");
        
        char nuevoChar=saludo.charAt(2);//Se esta buscando encontrar en la cadena saludo, la posición del caracter en la posicion 2 
        System.out.println("¿Qué dato esta en la posición 2? "+nuevoChar+"\n");
        
        boolean encontrar=saludo.contains("Ana");
        System.out.println("¿La cadena contiene la palabra Ana?"+encontrar+"\n");
        
        String subString=saludo.substring(1,8);//Mostrar los datos desde el indice 1 hasta el indice 8
        System.out.println(subString+"\n");
        
        String newString=saludo.replace("o","AA");//Codigo para remplazar todas las "o por "AA"
        System.out.println(newString);
        
        System.out.println(String.format("Mi edad es %d",edad));/*el "%d" solo es para datos de tipo entero
        Se le dice al sistema que la variable edad es de tipo entero e imprime el dato normalmente, 
        El %d puede ser utilizado tanto para int como para variables de tipo long y se puede juntar así:
        si se quiere agregar màs datos con la misma forma de imprimir se hace así,sumando progresivamente el "%d":
          System.out.println(String.format("Mi edad es %d %d",edad,70));
        
        System.out.println(String.format("Mi edad es %d %d" ,edad,distanciaAlSol));
        
        */
        System.out.println(String.format("Mi altura es %f",altura));/*Se coloca el "%f" para definir que es un valor flotante el que 
        se está imprimiendo al lado de la String, se utiliza el %.Xf para los datos que quiero que aparezcan después del punto
        El %f puede ser utilizado tanto para flotantes como para variables de tipo double
         System.out.println(String.format("Mi altura es %.4f",altura));
        */
        
        
        System.out.println("----------------------------------------------------------------------------");
        //Operaciones con Variables en JAVA
        
        //Area de un Rectangulo
        int a=17;
        int b=18;
        //Area
        int rArea=a*b;
        System.out.println("El area del rectangulo es : "+rArea);
        
        //Perimetro 
        int rPeri=(2*b)+(2*a);
        System.out.println("El perimetro del rectangulo es: "+rPeri);
        
        //Triangulo 
        
       b=10;
       a=6;
       
       double tArea=b*a/2;
        System.out.println(String.format("El area del rectangulo es: %.2f",tArea));
        
        //Hipotenusa
        //Raiz cuadrada de la   suma de los catetos
        
        double sumaCatetos=Math.pow(a,2)+Math.pow(b, 2);//La funcion math.pow se utiliza para elevar la potencia a un exponente
        double area=Math.sqrt(sumaCatetos);//La función sqrt es utilizada para sacar la raíz cuadrada, en este caso de "sumaCatetos"
        System.out.println(area);
        /*
        La función Math sirve para muchas cosas, recordar que también hay otras funciones como lo son "abs" que es absoluto el cual pasa un número negativo a positivo y si es positivo 
        queda tal como esta.
        También esta "ceil" que nos redondea al número más cercano o al número entero más cercano
        También esta "round" que redondea un numero al más cercano
        Entre muchas otras
        */
        
        
        
        //Circulo
        int r=30;
        double pi=3.1416;
        double cArea=pi*Math.pow(r,2);//El pow se utiliza para elevar un número a cierta potencia en este caso es el radio el número el cual se eleva
        System.out.println("El area del ciruculo es:"+cArea);
        
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }
}
