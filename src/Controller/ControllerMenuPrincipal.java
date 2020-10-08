package Controller;
import Modelo.Cliente;
import Modelo.Empresa;
import Modelo.Individual;
import Modelo.Producto;
import Utils.VariablesGlobales;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;

public class ControllerMenuPrincipal {
    public MenuBar menu;
    public TextField Nombre;
    public TextField Apellido;
    public TextField DPI;
    public TextField Nit;
    public TextField Direccion;
    public TableView tblClientesIndividuales;
    public TableColumn tfid;
    public TableColumn tfNombre;
    public TableColumn tfApellido;
    public TableColumn tfNit;
    public TableColumn tfDireccion;
    public TableColumn tfDPI;
    public Pane paneCliente;
    public Pane paneBoth;
    public Pane paneProducto;
    public TextField NombreProducto;
    public TextField PrecioUnitario;
    public Pane paneVerProducto;
    public TableView tblProductos;
    public TableColumn tfNombreProducto;
    public TableColumn tfPrecio;
    public TextField Contacto;
    public TextField Descuento;
    public TextField NombreE;
    public TextField ApellidoE;
    public TextField DireccionE;
    public TextField NitE;
    public TableView tblClientesEmpresa;
    public TableColumn tfidE;
    public TableColumn tfNombreE;
    public TableColumn tfApellidoE;
    public TableColumn tfNitE;
    public TableColumn tfDireccionE;
    public TableColumn tfContacto;
    public TableColumn tfDescuento;
    public TableView tblClientesIndivualesYempresa;
    public TableColumn tfid2;
    public TableColumn tfNombre2;
    public TableColumn tfApellido2;
    public TableColumn tfNit2;
    public TableColumn tfDireccion2;
    public TableColumn tfDPI2;
    public TableColumn tfContacto2;
    public TableColumn tfDescuento2;
    public TableColumn tfIdProducto;
    public Pane PaneEliminarCliente;
    public TextField idEliminarCliente;
    public Pane PaneEliminarProducto;
    public TextField idEliminarProducto;
    public Button BotonAgregarProducto;
    public Button BotonEditarProducto;
    public Button BotonBuscarProducto;
    public TextField CajaTextoBuscarProducto;


    public ControllerMenuPrincipal(){
    }

    @FXML
    public void initialize() {
        try {
            //Valores tabla Cliente Individual
            tfid.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("id"));
            tfNombre.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nombre"));
            tfApellido.setCellValueFactory(new PropertyValueFactory<Cliente, String>("apellido"));
            tfNit.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nit"));
            tfDireccion.setCellValueFactory(new PropertyValueFactory<Cliente, String>("direccion"));
            tfDPI.setCellValueFactory(new PropertyValueFactory<Cliente, String>("DPI"));
            //Valores tabla Cliente Empresa
            tfidE.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("id"));
            tfNombreE.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nombre"));
            tfApellidoE.setCellValueFactory(new PropertyValueFactory<Cliente, String>("apellido"));
            tfNitE.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nit"));
            tfDireccionE.setCellValueFactory(new PropertyValueFactory<Cliente, String>("direccion"));
            tfContacto.setCellValueFactory(new PropertyValueFactory<Cliente, String>("contacto"));
            tfDescuento.setCellValueFactory(new PropertyValueFactory<Cliente, String>("descuento"));
            //Valores tabla para ambos clientes
            tfid2.setCellValueFactory(new PropertyValueFactory<Cliente, Integer>("id"));
            tfNombre2.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nombre"));
            tfApellido2.setCellValueFactory(new PropertyValueFactory<Cliente, String>("apellido"));
            tfNit2.setCellValueFactory(new PropertyValueFactory<Cliente, String>("nit"));
            tfDireccion2.setCellValueFactory(new PropertyValueFactory<Cliente, String>("direccion"));
            tfDPI2.setCellValueFactory(new PropertyValueFactory<Cliente, String>("DPI"));
            tfContacto2.setCellValueFactory(new PropertyValueFactory<Cliente, String>("contacto"));
            tfDescuento2.setCellValueFactory(new PropertyValueFactory<Cliente, String>("descuento"));
            //valores para la tabla producto
            tfIdProducto.setCellValueFactory(new PropertyValueFactory<Producto, String>("id"));
            tfNombreProducto.setCellValueFactory(new PropertyValueFactory<Producto, String>("nombreProducto"));
            tfPrecio.setCellValueFactory(new PropertyValueFactory<Producto, Integer>("precioUnitario"));


        } catch (Exception e){
            System.out.println("Error En Initialize, Exception: "+e);
        }
    }

    /***
     * cerrar ventana del menu principal
     * @param actionEvent
     */
    public void close(ActionEvent actionEvent) {
        Stage stage = (Stage) menu.getScene().getWindow();
        stage.close();
    }

    /***
     * agregar un nuevo cliente de tipo individual
     * @param actionEvent
     */
    public void AgregarClienteIndividual(ActionEvent actionEvent) {
        //MostarPanel(paneBoth);
        VariablesGlobales.DataSistema1.addClient(new Individual(Nombre.getText(),Apellido.getText(),Nit.getText(),Direccion.getText(),DPI.getText()));
        JOptionPane.showMessageDialog(null, "Cliente de tipo individual agregado exitosamente");
        //ObservableList<Cliente> data = FXCollections.observableArrayList(DataSistema.listaClientes);
    }

    /***
     * Agregar cliente de tipo empresa
     * @param actionEvent
     */
    public void AgregarClienteEmpresa(ActionEvent actionEvent) {
        VariablesGlobales.DataSistema1.addClient(new Empresa(NombreE.getText(),ApellidoE.getText(),NitE.getText(),DireccionE.getText(),Contacto.getText(),Integer.parseInt(Descuento.getText())));
        JOptionPane.showMessageDialog(null, "Cliente de tipo Empresa agregado exitosamente");
    }

    /***
     * hace visible el panel para que el usuario ingrese el id del cliente a eliminar
     * @param actionEvent
     */
    public void MostrarEliminarCliente(ActionEvent actionEvent) {
        MostarPanel(PaneEliminarCliente);
    }

    /***
     * Elimina el cliente basado en el id
     * @param actionEvent
     */
    public void EliminarCliente(ActionEvent actionEvent) {
        try{
            VariablesGlobales.DataSistema1.EliminarCliente(Integer.parseInt(idEliminarCliente.getText()));
            JOptionPane.showMessageDialog(null, "El cliente con id: "+idEliminarCliente.getText()+" ha sido eliminado exitosamente");
        } catch (Exception e){
            System.out.println("Ocurrio un error al eliminar el cliente, Exception: "+e);
            JOptionPane.showMessageDialog(null, "El cliente no ha sido eliminado, por favor ingrese un id valido");
        }
    }

    /***
     * Modifica los registros del cliente
     * @param actionEvent
     */
    public void ModificarCliente(ActionEvent actionEvent) {

    }//fin ModificarCliente


    /***
     * hace visible el panel para que el usuario seleccione que clientes desea ver
     * @param actionEvent
     */
    public void VisualizarClientes(ActionEvent actionEvent) {
        MostarPanel(paneCliente);
    }

    /***
     * Muestra una tabla a la vez y esconde las demas
     * @param tempGrid recibe la tabla que se desea mostrar
     */
    public void MostrarGrid(TableView tempGrid){
        tblClientesIndividuales.setVisible(false);
        tblClientesEmpresa.setVisible(false);
        tblClientesIndivualesYempresa.setVisible(false);
        tempGrid.setVisible(true);
    }

    /***
     * muestra los datos de los clientes individuales
     * @param actionEvent
     */
    public void MostratClientesIndividuales(ActionEvent actionEvent) {
        try {
            MostrarGrid(tblClientesIndividuales);
                    ObservableList<Cliente> data = FXCollections.observableArrayList(VariablesGlobales.DataSistema1.getListaClientesIndividuales());
            tblClientesIndividuales.setItems(data);

        }catch (Exception e){
            System.out.println("Ocurrio un problema al mostrar Clientes Individuales, Exception: "+e);
        }
    }

    /***
     * Muestra los datos de los clientes tipo empresa
     * @param actionEvent
     */
    public void MostrarClientesEmpresa(ActionEvent actionEvent) {
        try {
            MostrarGrid(tblClientesEmpresa);
            ObservableList<Cliente> data = FXCollections.observableArrayList(VariablesGlobales.DataSistema1.getListaClientesEmpresa());
            tblClientesEmpresa.setItems(data);

        }catch (Exception e){
            System.out.println("Ocurrio un problema al mostrar Clientes de tipo empresa, Exception: "+e);
        }
    }




    public void MostrarAmbosClientes(ActionEvent actionEvent) {
        try {
            MostrarGrid(tblClientesIndivualesYempresa);
            ObservableList<Cliente> data = FXCollections.observableArrayList(VariablesGlobales.DataSistema1.getListaClientes());
            tblClientesIndivualesYempresa.setItems(data);
        }catch (Exception e){
            System.out.println("Ocurrio un problema al mostrar ambos clientes, Exception: "+e);
        }
    }





    public void MostrarVentanaAgregarCliente(ActionEvent actionEvent) {
        MostarPanel(paneBoth);
    }

    /***
     * muestra en pantalla los campos para ingresar el producto
     * @param actionEvent
     */
    public void VisualizarAgregarProducto(ActionEvent actionEvent) {
        MostarPanel(paneProducto);
        BotonAgregarProducto.setVisible(true);
    }

    /**
     * Agrega un nuevo producto a la lista
     */
    public void AgregarProducto(ActionEvent actionEvent) {
        try {
            MostarPanel(paneProducto);
            BotonAgregarProducto.setVisible(true);
            VariablesGlobales.DataSistema1.addProducto((new Producto(NombreProducto.getText(),Integer.parseInt(PrecioUnitario.getText()))));
            JOptionPane.showMessageDialog(null, "Producto agregado exitosamente");
        } catch (Exception e){ System.out.println("Ocurrio un problema al agregar un nuevo producto a la lista, Exception: "+e);
            JOptionPane.showMessageDialog(null, "Producto no agregado, asegurese de ingresar solo valores numericos en el campo precio unitario");
        }
    }

    /***
     * visualiza el panel para buscar el producto a editar
     * @param actionEvent
     */
    public void VisualizarEditarProducto(ActionEvent actionEvent) {
        MostarPanel(paneProducto);
        NombreProducto.setText("");
        PrecioUnitario.setText("");
        BotonBuscarProducto.setVisible(true);
        CajaTextoBuscarProducto.setVisible(true);
    }

    /***
     * busca el producto a editar
     * @param actionEvent
     */
    public void BuscarProducto(ActionEvent actionEvent) {
        BotonAgregarProducto.setVisible(false);
        BotonEditarProducto.setVisible(false);
        Producto tempProducto = VariablesGlobales.DataSistema1.listaProductos(Integer.parseInt(CajaTextoBuscarProducto.getText()));
        NombreProducto.setText(tempProducto.getNombreProducto());
        PrecioUnitario.setText(String.valueOf(tempProducto.getPrecioUnitario()));
        BotonEditarProducto.setVisible(true);
    }

    public void EditarProducto(ActionEvent actionEvent) {
        try {
            MostarPanel(paneProducto);
            BotonAgregarProducto.setVisible(false);
            BotonEditarProducto.setVisible(true);
            BotonBuscarProducto.setVisible(true);
            CajaTextoBuscarProducto.setVisible(true);
            VariablesGlobales.DataSistema1.EditarProducto(Integer.parseInt(CajaTextoBuscarProducto.getText()),NombreProducto.getText(),Integer.parseInt(PrecioUnitario.getText()));
            JOptionPane.showMessageDialog(null, "Producto Actualizado exitosamente");
            ObservableList<Producto> data = FXCollections.observableArrayList(VariablesGlobales.DataSistema1.getListaProductos());
            tblProductos.setItems(data);
        } catch (Exception e){ System.out.println("Ocurrio un problema al actualizar el producto a la lista, Exception: "+e);
            JOptionPane.showMessageDialog(null, "Producto no actualizado, asegurese de ingresar solo valores numericos en el campo precio unitario");

        }
    }



    /***
     * muestra el panel para ingresar el id del producto a eliminar
     * @param actionEvent
     */

    public void MostrarEliminarProducto(ActionEvent actionEvent) {
        MostarPanel(PaneEliminarProducto);
    }

    /***
     * Elimina un producto de la lista basado en el id
     * @param actionEvent
     */
    public void EliminarProducto(ActionEvent actionEvent) {
        try{
            VariablesGlobales.DataSistema1.EliminarProducto(Integer.parseInt(idEliminarProducto.getText()));
            JOptionPane.showMessageDialog(null, "El producto con id: "+idEliminarProducto.getText()+" ha sido eliminado exitosamente");
        } catch (Exception e){
            System.out.println("Ocurrio un error al eliminar el producto, Exception: "+e);
            JOptionPane.showMessageDialog(null, "El producto no ha sido eliminado, por favor ingrese un id valido");
        }
    }


    /***
     * Muestra una lista de todos los productos disponibles
     * @param actionEvent
     */
    public void MostrarListaDeProductos(ActionEvent actionEvent) {
        MostarPanel(paneVerProducto);
        try {
            ObservableList<Producto> data = FXCollections.observableArrayList(VariablesGlobales.DataSistema1.getListaProductos());
            tblProductos.setItems(data);
        }catch (Exception e){ System.out.println("Ocurrio un error al mostrar los productos, Exception: "+e);
        }
    }



    public void AgregarOrdenCompra(ActionEvent actionEvent) {
    }




    /***
     * Muestra un panel en especifico y oculta los demas
     * @param inPanel recibe el panel a mostrar
     */
    public void MostarPanel(Pane inPanel){
        paneBoth.setVisible(false);
        paneCliente.setVisible(false);
        paneProducto.setVisible(false);
        paneVerProducto.setVisible(false);
        PaneEliminarCliente.setVisible(false);
        PaneEliminarProducto.setVisible(false);
        BotonAgregarProducto.setVisible(false);
        BotonEditarProducto.setVisible(false);
        BotonBuscarProducto.setVisible(false);
        CajaTextoBuscarProducto.setVisible(false);
        inPanel.setVisible(true);

    }



}
