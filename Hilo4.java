
package practicahilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo4 extends Thread
{
    @Override
    public void run()
    {
        Hilo3 h3= new Hilo3(); 
        try {
            Thread.sleep(7000);//hacemos una espera de 7000 milisegundos 

        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo4.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("La suma es: "+h3.resultado());
    }
    
}
