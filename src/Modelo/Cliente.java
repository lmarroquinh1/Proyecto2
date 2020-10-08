package Modelo;
import Utils.Utilerias;

public class Cliente {
    int id;
    static int sigIdCliente=0;
    String nombre;
    String apellido;
    String nit;
    String direccion;

    /***
     * agregar un constructor sin parametros
     */

    public Cliente(){
        sigIdCliente++;
        id=sigIdCliente;//asignar valor a la propiedad id
        System.out.println("Se ha agregado un nuevo cliente con ID "+id);
    }

    /***
     *constructor con los parametros necesarios
     * @param nombre guardar el nombre del cliente
     * @param apellido guarda el apellido del cliente
     * @param nit guarda el numero de nit del cliente
     * @param direccion guarda la direccion del cliente
     */
    public Cliente(String nombre, String apellido, String nit, String direccion){
        this();//asignar id utilizando constructor 1
        this.nombre = nombre;
        this.apellido = apellido;
        this.nit = nit;
        this.direccion = direccion;
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getNit(){
        return nit;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setNit(String nit){
        this.nit = nit;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    @Override
    //creacion del metodo toString
    public String toString(){
        return  "["+ Utilerias.getNombreClase(Cliente.class)+"]"+
                "{id="+id+
                ", nombre="+nombre+
                ", apellido="+apellido+
                ", nit="+nit+
                ", direccion="+direccion+"}";

    }

}