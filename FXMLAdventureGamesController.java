/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamersaide;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
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
 * @author User
 */
public class FXMLAdventureGamesController implements Initializable {

    @FXML
    private Button AdventureBackButton;
    @FXML
    private Button AdventureDownloadButton1;
    @FXML
    private Button AdventureDownloadButton2;
    @FXML
    private Button AdventureDownloadButton3;
    @FXML
    private Button AdventureDownloadButton4;
    @FXML
    private Button AdventureDownloadButton5;
    @FXML
    private Button adventureReviewButton1;
    @FXML
    private Button adventureReviewButton2;
    @FXML
    private Button adventureReviewButton3;
    @FXML
    private Button adventureReviewButton4;
    @FXML
    private Button adventureReviewButton5;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleAdventureBackButton(ActionEvent event) throws IOException {
         try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLCategory.fxml"));

            Scene scene = new Scene(root);
            //scene.getStylesheets().add(getClass().getResource("FXMLQuestion2.css").toExternalForm());
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            System.out.println(e);
        }
         
       
    }

    @FXML
    private void handleAdventureDownloadButton1(ActionEvent event) {
         Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.inkle.eightydays"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void handleAdventureDownloadButton2(ActionEvent event) {
         Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.bscotch.crashlands"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void handleAdventureDownloadButton3(ActionEvent event) {
         Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.playdigious.evoland2"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void handleAdventureDownloadButton4(ActionEvent event) {
         Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.miHoYo.GenshinImpact"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void handleAdventureDownloadButton5(ActionEvent event) {
         Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.toppluva.grandmountain"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void handleAdventureReviewButton1(ActionEvent event) {
        try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLAdventureReview1.fxml"));

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
    private void handleAdventureReviewButton2(ActionEvent event) {
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
    private void handleAdventureReviewButton3(ActionEvent event) {
         try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLAdventureReview3.fxml"));

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
    private void handleAdventureReviewButton4(ActionEvent event) {
         try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLAdventureReview4.fxml"));

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
    private void handleAdventureReviewButton5(ActionEvent event) {
         try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLAdventureReview5.fxml"));

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
