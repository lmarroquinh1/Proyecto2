package Modelo;

import java.util.ArrayList;
public class DataSistema {
    public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    public static ArrayList<Producto> listaProductos = new ArrayList<Producto>();
    public static ArrayList<Orden> listaOrden = new ArrayList<Orden>();
    public Individual ClienteIndividual1 = new Individual("Luis","Marroquin","8591234587","14 calle 3-24 zona 14","8459845730111");
    public Empresa ClienteEmpresa1 = new Empresa("Marcos","Martinez","12345678","13 Av 5-24 zona 13 Pamplona","Telus",5) ;
    public DataSistema (){
        /***
         * crear 4 clientes de tipo individual
         */

        listaClientes.add(ClienteIndividual1);
        listaClientes.add(new Individual("Carlos","Castillo","98403827","1 calle 4-25 zona 15","9384758493011"));
        listaClientes.add(new Individual("Mariano","Choc","98372613","4 Av 5-23 zona 3","9384950685746"));
        listaClientes.add(new Individual("Rosa","Perez","84937456","2 calle 3-24 zona 18","3746589384756"));

        /***
         * crear 4 clientes de tipo empresa
         */

        listaClientes.add(ClienteEmpresa1);
        listaClientes.add(new Empresa("Maria","Perez","98770236","3 Av 7-28 zona 15","Intelaf",10));
        listaClientes.add(new Empresa("Sandra","Torres","9874653","1 Av 2-24 zona 1","Cemaco",7));
        listaClientes.add(new Empresa("Juan","Hernandez","87263548","13 Av 5-24 zona 2","Max",3));

        /***
         * crear 8 productos y agregarlos a la lista de productos
         */
        listaProductos.add(new Producto("llanta",300));
        listaProductos.add(new Producto("retrovisor",50));
        listaProductos.add(new Producto("transmision",1300));
        listaProductos.add(new Producto("clutch",250));
        listaProductos.add(new Producto("suspencion delantera",1000));
        listaProductos.add(new Producto("timon",500));
        listaProductos.add(new Producto("aro",800));
        listaProductos.add(new Producto("luz delantera",350));
    }


    /***
     * Elimina un cliente de la lista segun el numero de id
     * @param id numero que sera utilizado para eliminar el cliente
     */
    public void EliminarCliente(int id) {
        Cliente ClienteAeliminar = null;
        for (Cliente tempCliente : listaClientes
        ) {
            if (tempCliente.getId() == id) {
                ClienteAeliminar=tempCliente;
            }
        }
        listaClientes.remove(ClienteAeliminar);
    }


    /***
     * retorna una lista de todos los clientes
     * @return
     */
    public ArrayList<Cliente> getListaClientes(){
        return listaClientes;
    }

    /***
     * retorna una lista de los clientes tipo individual (ControllerMenuPrincipal)
     * @return
     */
    public ArrayList<Cliente> getListaClientesIndividuales(){
        ArrayList<Cliente> tempList = new ArrayList<Cliente>();
        for (Cliente tempCliente: listaClientes
        ) {
            if (tempCliente.getClass() == ClienteIndividual1.getClass()){
                tempList.add(tempCliente);
            }
        }
        return tempList;
    }

    /***
     * Retorna una lista de los clientes tipo empresa (ControllerMenuPrincipal)
     * @return
     */
    public ArrayList<Cliente> getListaClientesEmpresa(){
        ArrayList<Cliente> tempList = new ArrayList<Cliente>();
        for (Cliente tempCliente: listaClientes
        ) {
            if (tempCliente.getClass() == ClienteEmpresa1.getClass()){
                tempList.add(tempCliente);
            }
        }
        return tempList;
    }



    /***
     * retorna una lista de productos
     * @return
     */
    public ArrayList<Producto> getListaProductos(){
        return listaProductos;
    }

    public void addClient (Cliente cliente){
        listaClientes.add(cliente);
    }

    public void addProducto (Producto producto){
        listaProductos.add(producto);
    }

    /***
     * elimina un producto de la lista basado en el id
     * @param id numero utilizado para identificar el producto a eliminar
     */
    public void EliminarProducto(int id) {
        Producto ProductoAeliminar = null;
        for (Producto tempProducto : listaProductos
        ) {
            if (tempProducto.getId() == id) {
                ProductoAeliminar=tempProducto;
            }
        }
        listaProductos.remove(ProductoAeliminar);
    }


    /***
     * busca el producto en la lista de productos basandose en el id y devuelve el producto correspondiente
     * @param pIdProducto recibe el id del producto a buscar
     * @return retorna el producto encontrado
     */
    public Producto listaProductos(int pIdProducto) {
        Producto producto = null;
        for (Producto temp: listaProductos
        ) { if (temp.getId()==pIdProducto){
            producto = temp;
        }
        }
        return producto;
    }

    /***
     * edita un producto en la lista de productos
     * @param id del producto
     * @param PNombre nombre del producto
     * @param PrecioUnitario precio unitario del producto
     */
    public void EditarProducto(int id, String PNombre, int PrecioUnitario){
        Producto producto = null;
        int contador = 0, index=0;
        boolean idExist = false;
        for (Producto temp: listaProductos
        ) { if (temp.getId()==id){
            //System.out.println("producto encontrado en la posicion "+contador);
            producto = temp;
            index=contador;
            idExist=true;
        } contador++;
        }//fin for
        if (idExist){
            producto.setNombreProducto(PNombre);
            producto.setPrecioUnitario(PrecioUnitario);
            listaProductos.set(index,producto);
            //System.out.println("Producto actualizado");
        }
    }


}