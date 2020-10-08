import Modelo.Cliente;
import Modelo.Empresa;
import Modelo.Individual;
import Modelo.Producto;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/View/Login.fxml"));
        primaryStage.setTitle("Loging page");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

/*
        Producto producto1 = new Producto();
        System.out.println("producto 1 creado");
        int id =  producto1.getId();
        String nombre = producto1.getNombreProducto();
        System.out.println("nombre: "+nombre+" id: "+id);

        Producto producto2 = new Producto("Producto1",250);
        System.out.println("producto 2 creado");
        System.out.println(producto2.toString());

        Cliente cliente1 = new Cliente("Luis","Marroquin","123456-9","Direccion 1");
        System.out.println("Cliente 1 creado");
        System.out.println(cliente1.toString());

        Individual individual1 = new Individual("Luis","Marroquin","1234567","Direccion 1","251265450111");
        System.out.println("individual 1 creado");
        System.out.println(individual1.toString());

        Empresa empresa1 = new Empresa("Luis","Marroquin","1234567","Direccion 1","contacto 1",10);
        System.out.println("empresa 1 creado");
        System.out.println(empresa1.toString());
        */

    }//cerrar metodo main



}
