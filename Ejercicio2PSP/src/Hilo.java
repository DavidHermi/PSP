/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author findag
 */
public class Hilo extends Thread
{
    public Hilo(String nombre)
    {
        super(nombre);
    }

    public void run()
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Esta es la iteracion " + i + " del " + getName());

            try
            {
                // Dormimos el proceso de manera aleatoria en cada iteracion.
                sleep((long) (Math.random() * (500 - 100)+100));
            }
            catch (InterruptedException ex)
            {
                System.out.println("Error " + ex);
            }
        }
    }

}