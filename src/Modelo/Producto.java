package Modelo;
import Utils.Utilerias;

public class Producto {
    private static int sigIdProducto=2000;
    private int id;
    private String nombreProducto;
    private int precioUnitario;


    //agregar un constructor sin parametros
    public Producto(){
        id=sigIdProducto;//asignar valor a la propiedad id
        sigIdProducto++;
    }//cerrar constructor 1


    //agregar un constructor con los parametros necesarios
    public Producto(String nombreProducto, int precioUnitario ){
        this();//asignar id utilizando constructor 1
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
    }//cerrar constructor 2

    //metodos para acceder a los atributos
    public void setNombreProducto(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }

    public String getNombreProducto(){
        return nombreProducto;
    }

    public int getId(){
        return id;
    }

    public void setPrecioUnitario(int precioUnitario){
        this.precioUnitario = precioUnitario;
    }

    public int getPrecioUnitario(){
        return precioUnitario;
    }

    //creacion del metodo toString
    public String toString(){
        return  "["+Utilerias.getNombreClase(Producto.class)+"]"+
                "{id="+id+
                ", nombre="+nombreProducto+
                ", Precio Unitario="+precioUnitario+"}";
    }


}
