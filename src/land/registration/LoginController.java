/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package land.registration;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author syeds
 */
public class LoginController implements Initializable {

    @FXML
    private TextField passwordTxtField;
    @FXML
    private TextField userIdTxtField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginBtnOnclick(ActionEvent event) {
        String username = userIdTxtField.getText();
        String password = passwordTxtField.getText();

        // Placeholder for actual authentication logic
        if ("admin".equals(username) && "password".equals(password)) {
            try {
                // Load the next scene
                Parent dashboardRoot = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                Scene dashboardScene = new Scene(dashboardRoot);

                // Get the current window (stage) and set the new scene
                Stage primaryStage = (Stage) userIdTxtField.getScene().getWindow(); // usernameField is a node in the current scene
                primaryStage.setScene(dashboardScene);

            } catch (Exception e) {
                e.printStackTrace();
                showAlert(Alert.AlertType.ERROR, "Scene Switch Failed", "Could not load the dashboard scene.");
            }
        } else {
            showAlert(Alert.AlertType.ERROR, "Login Failed", "Invalid username or password.");
        }
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    
}
