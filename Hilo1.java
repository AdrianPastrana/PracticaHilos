package practicahilos;
import java.util.Scanner;
public class Hilo1 extends Thread
{
    static int n1;
    @Override
    public void run()
    {
        Hilo2 n= new Hilo2();
        Hilo4 r=new Hilo4();
        Scanner c = new Scanner(System.in);        
        System.out.println("Dame el primer numero");
        n1=c.nextInt();
        if (n1==0)
        {
            n.stop();
            r.stop();
        }
        else 
        {
            n.start();
            r.start();
        }
    }    
}