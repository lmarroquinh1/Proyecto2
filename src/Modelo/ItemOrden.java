package Modelo;
import Utils.Utilerias;
import Utils.VariablesGlobales;

public class ItemOrden {
    int noLinea; //será un número correlativo de la orden
    int cantidad;
    double total;
    Producto producto;

    /***
     *constructor de la clase ItemOrden
     * @param pNoLinea numero de correlativo de la orden
     * @param pCantidad cantidad de articulos a comprar
     * @param pIdProducto id del producto correspondiente en la lista de productos
     */
    public ItemOrden(int pNoLinea, int pCantidad, int pIdProducto){
        this.noLinea = pNoLinea;
        this.cantidad = pCantidad;
        //producto = VariablesGlobales.DataSistema1.listaProductos(pIdProducto);
    }

    double getTotalItem(){
        total = producto.getPrecioUnitario()*cantidad;
        return total;
    }

    public String toString(){
        return "["+Utilerias.getNombreClase(ItemOrden.class)+"]"+
                " {No. de Lineas="+noLinea+
                ", cantidad="+cantidad+
                ", Precio Unitario="+producto.getPrecioUnitario()+
                ", total="+total+"}";
    }

}
