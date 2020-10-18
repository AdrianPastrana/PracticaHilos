/*
19 de Marzo de 2019
programa que lea dos numeros 
en el hilo uno pedira el valor 1
hilo 2 el valor 2 
hilo 3 hara la suma 
hilo 4 muestra el resultado 
 */
package practicahilos;

public class PracticaHilos 
{
    public static void main(String[] args) 
    {
        Hilo1 h1= new Hilo1();
        Hilo2 h2= new Hilo2();
        Hilo3 h3= new Hilo3();
        Hilo4 h4= new Hilo4();
        h1.start();
        //h2.start();
        //h3.start();
        //h4.start();
    }
}