package Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import javax.swing.*;

public class LoginController {
    public TextField txtUsuario;
    public PasswordField txtContrasenia;

    public void Ingresar(ActionEvent actionEvent) {
        /***
         *validar el ingreso al usuario
         *usuario=chris , password=123456
         */
        if( txtUsuario.getText().equals("chris") && txtContrasenia.getText().equals("123456") ){
            /***
             * con acceso condecido cargar la vista del menu principal
             */
            try {
                //JOptionPane.showMessageDialog(null, "Acceso concedido");
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/View/MenuPrincipal.fxml"));
                Pane root = (Pane) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setTitle("Menu Principal");
                stage.setScene(new Scene(root, 900, 400));
                stage.show();

                /***
                 *cerrar la vista del login
                 */
                Stage stage2 = (Stage) txtUsuario.getScene().getWindow();
                stage2.close();
            }catch (Exception e){
                System.out.println("Ocurrio un error en la secuencia login, Exception: "+e.toString());
                e.printStackTrace();
            }

            /***
             *acceso restringido, mostrar mensaje con error al usuario
             */
        }else{
            JOptionPane.showMessageDialog(null, "Usuario/Contraseña INCORRECTO");
        }
    }
}//fin clase loginController


