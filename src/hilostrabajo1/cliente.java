package hilostrabajo1;
public class cliente{
    public String nombre;
    public int tiempo;
    
    public cliente(String nombre, int tiempo){
        this.nombre=nombre;
        this.tiempo=tiempo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTiempo(){
        return this.tiempo;
    }
}