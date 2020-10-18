package practicahilos;
import java.util.logging.Level;
import java.util.logging.Logger;
import static practicahilos.Hilo1.n1;
import static practicahilos.Hilo2.n2;
public class Hilo3 extends Thread
{
    static int r; 
    public int resultado()
    {
        try 
        {
            Thread.sleep(5000);//hacemos una espera de 7000 milisegundos 
        } 
        catch (InterruptedException ex) 
        {
            Logger.getLogger(Hilo3.class.getName()).log(Level.SEVERE, null, ex);
        }
        int r = n1+n2;
        return r;
    }
}