package hilostrabajo1;
public class administracion implements Runnable{
    private cliente cliente;
    private int tiempo;
    public administracion(cliente cliente){
        this.cliente=cliente;
    }
    public void run(){
        System.out.println("La consola "+Thread.currentThread().getName()+" empezo a ser usada por "+
                cliente.getNombre()+" por "+cliente.getTiempo()+" segundos");
        tiempo(cliente);
    }
    public void tiempo(cliente cliente){
        try {
            Thread.sleep(cliente.getTiempo()*1000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            System.out.println("Se termino de usar la consola "+Thread.currentThread().getName());
        }
    }
}