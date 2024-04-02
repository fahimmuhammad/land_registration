/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hafijurrahman
 */
public class LoginController implements Initializable {

    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private Button Login;
    @FXML
    private TextField usenameField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    



    @FXML
    private void loginButtonOncCick(ActionEvent event) throws IOException {
               Parent mainSceneParent = FXMLLoader.load(getClass().getResource("govtDashboard.fxml"));
        Scene scene1= new Scene(mainSceneParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
    
        
                String username = usernameField.getText();
        String password = passwordField.getText();

        if (isValidCredentials(username, password)) {
            System.out.println("Login successful!");
            // Add code to switch to another scene or perform other actions upon successful login
        } else {
            System.out.println("Login failed. Please check your username and password.");
            // Add code to show an error message or perform other actions upon failed login
        }
    }

    private boolean isValidCredentials(String username, String password) throws IOException {
        // In a real application, you would check against a database or some other authentication mechanism
        return username.equals("Arman") && password.equals("arman115");

    
    
    }

    
    
}

