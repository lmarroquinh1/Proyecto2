package Modelo;
import java.util.Date;

public class Orden {
    int id;
    Cliente cliente;
    ItemOrden item1;
    ItemOrden item2;
    Date fechaOrden;
    double precioEnvio;
    double total;
    String tipoEnvio;
    String estado;
    static int sigIdOrden;
    int diasEnvio;


    public Orden(){
        sigIdOrden++;
        id=sigIdOrden;
        total = 0.0;
        fechaOrden = new Date();
    }

    public Orden(Date pFecha){
        this();//llamar al constructor 1 para aprovechar su implementacion
        this.fechaOrden = pFecha;
    }


    public Orden(int pCliente, Date pFecha){
        this.cliente.id = pCliente;
        this.fechaOrden = pFecha;
    }


    double getTotalOrden(){
        total = precioEnvio+item1.getTotalItem();
        return total;
    }
}
