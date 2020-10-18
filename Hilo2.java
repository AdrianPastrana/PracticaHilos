package practicahilos;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Hilo2 extends Thread
{
  static int n2;
  @Override
  public void run()
    {
        Scanner c = new Scanner(System.in);
        
        try {
           Thread.sleep(3000);//hacemos una espera de 7000 milisegundos 

        } catch (InterruptedException ex) {
            Logger.getLogger(Hilo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Dame el segundo numero");
        n2=c.nextInt();
    }    
}
