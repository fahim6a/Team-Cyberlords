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
public class FXMLActionGamesController implements Initializable {

    @FXML
    private Button ActionDownloadButton1;
    @FXML
    private Button ActionDownloadButton2;
    @FXML
    private Button ActionDownloadButton3;
    @FXML
    private Button ActionDownloadButton4;
    @FXML
    private Button ActionDownloadButton5;
    @FXML
    private Button ActionBackButton;
    @FXML
    private Button actionReviewButton1;
    @FXML
    private Button actionReviewButton2;
    @FXML
    private Button actionReviewButton3;
    @FXML
    private Button actionReviewButton4;
    @FXML
    private Button actionReviewButton5;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   

    @FXML
    private void handleActionDownloadButton1(ActionEvent event) {
         Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.garena.game.codm"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void handleActionDownloadButton2(ActionEvent event) {
        Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.tencent.ig"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void handleActionDownloadButton3(ActionEvent event) {
        Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.gameloft.android.ANMP.GloftM5HM"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void handleActionDownloadButton4(ActionEvent event) {
        Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.dts.freefireth"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void handleActionDownloadButton5(ActionEvent event) {
        Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.wb.goog.mkx"));
        }
        catch(IOException err){
    }
        catch(URISyntaxException err){ 
            
        }
    }

    @FXML
    private void handleActionBackButton(ActionEvent event) throws IOException {
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
    private void handleActionReviewButton1(ActionEvent event) {
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
    private void handleActionReviewButton2(ActionEvent event) {
        try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLActionReview2.fxml"));

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
    private void handleActionReviewButton3(ActionEvent event) {
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

    @FXML
    private void handleActionReviewButton4(ActionEvent event) {
        try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLActionReview4.fxml"));

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
    private void handleActionReviewButton5(ActionEvent event) {
        try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLActionReview5.fxml"));

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
    
    
