/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamersaide;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class FXMLNewsFeedController implements Initializable {

    @FXML
    private Button categoryButton;
    @FXML
    private Button newsFeedBackButton;
    @FXML
    private Button NFReviewButton1;
    @FXML
    private Button NFReviewButton2;
    @FXML
    private Button NFReviewButton3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleCategoryButton(ActionEvent event) throws IOException {
          try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLCategory.fxml"));

            Scene scene = new Scene(root);
            //scene.getStylesheets().add(getClass().getResource("FXMLQuestion2.css").toExternalForm());
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
             stage.resizableProperty().setValue(false);
            stage.show();
        } catch (IOException e) {
            System.out.println(e);
        }
         
    }

    @FXML
    private void handleNewsFeedBackButton(ActionEvent event) {
         try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

            Scene scene = new Scene(root);
            //scene.getStylesheets().add(getClass().getResource("FXMLQuestion2.css").toExternalForm());
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
             stage.resizableProperty().setValue(false);
            stage.show();
        } catch (IOException e) {
            System.out.println(e);
        }
         
    }

    @FXML
    private void handleNFReviewButton1(ActionEvent event) {
         try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLActionReview1.fxml"));

            Scene scene = new Scene(root);
            //scene.getStylesheets().add(getClass().getResource("FXMLQuestion2.css").toExternalForm());
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
             stage.resizableProperty().setValue(false);
            stage.show();
        } catch (IOException e) {
            System.out.println(e);
        }
       
        
    }

    @FXML
    private void handleNFReviewButton2(ActionEvent event) {
         try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLAdventureReview2.fxml"));

            Scene scene = new Scene(root);
            //scene.getStylesheets().add(getClass().getResource("FXMLQuestion2.css").toExternalForm());
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
             stage.resizableProperty().setValue(false);
            stage.show();
        } catch (IOException e) {
            System.out.println(e);
        }
       
        
    }

    @FXML
    private void handleNFReviewButton3(ActionEvent event) {
         try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLActionReview3.fxml"));

            Scene scene = new Scene(root);
            //scene.getStylesheets().add(getClass().getResource("FXMLQuestion2.css").toExternalForm());
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.resizableProperty().setValue(false);
            stage.show();
        } catch (IOException e) {
            System.out.println(e);
        }
       
        
    }
    
}
