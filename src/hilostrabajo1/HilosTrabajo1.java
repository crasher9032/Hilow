package hilostrabajo1;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JOptionPane;

public class HilosTrabajo1 {
    public static void main(){
        int numClientes=Integer.parseInt(JOptionPane.showInputDialog("Numero de clientes"));
        int numConsolas=3;
        ArrayList<cliente> clientes = new ArrayList<>();
        for (int i = 0; i < numClientes; i++) {
            clientes.add(new cliente(("Cliente "+i), (int)(Math.random()*20)+10));
        }
        ExecutorService executor = Executors.newFixedThreadPool(numConsolas);
        for(cliente cliente:clientes){
            Runnable us = new administracion(cliente);
            executor.execute(us);
        }
        executor.shutdown();
    }
}