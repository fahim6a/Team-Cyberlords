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
public class FXMLOpenWorldGamesController implements Initializable {

    @FXML
    private Button OpenWorldBackButton;
    @FXML
    private Button OpenWorldDownloadButton1;
    @FXML
    private Button OpenWorldDownloadButton2;
    @FXML
    private Button OpenWorldDownloadButton3;
    @FXML
    private Button OpenWorldDownloadButton4;
    @FXML
    private Button OpenWorldDownloadButton5;
    @FXML
    private Button openWorldReviewButton1;
    @FXML
    private Button openWorldReviewButton2;
    @FXML
    private Button openWorldReviewButton3;
    @FXML
    private Button openWorldReviewButton4;
    @FXML
    private Button openWorldReviewButton5;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleOpenWorldBackButton(ActionEvent event) throws IOException {
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
    private void handleOpenWorldDownloadButton1(ActionEvent event) {
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.FDGEntertainment.Oceanhorn.gp"));
        } catch (IOException err) {
        } catch (URISyntaxException err) {

        }
    }

    @FXML
    private void handleOpenWorldDownloadButton2(ActionEvent event) {
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.zulu.cl2"));
        } catch (IOException err) {
        } catch (URISyntaxException err) {

        }
    }

    @FXML
    private void handleOpenWorldDownloadButton3(ActionEvent event) {
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.gta.real.gangster.crime"));
        } catch (IOException err) {
        } catch (URISyntaxException err) {

        }
    }

    @FXML
    private void handleOpenWorldDownloadButton4(ActionEvent event) {
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.rockstargames.gtavc"));
        } catch (IOException err) {
        } catch (URISyntaxException err) {

        }
    }

    @FXML
    private void handleOpenWorldDownloadButton5(ActionEvent event) {
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.naxeex.top.rgc"));
        } catch (IOException err) {
        } catch (URISyntaxException err) {

        }
    }

    @FXML
    private void handleOpenWorldReviewButton1(ActionEvent event) {
         try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLOpenWorldReview1.fxml"));

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
    private void handleOpenWorldReviewButton2(ActionEvent event) {
         try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLOpenWorldReview2.fxml"));

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
    private void handleOpenWorldReviewButton3(ActionEvent event) {
         try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLOpenWorldReview3.fxml"));

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
    private void handleOpenWorldReviewButton4(ActionEvent event) {
        try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLOpenWorldReview4.fxml"));

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
    private void handleOpenWorldReviewButton5(ActionEvent event) { 
        try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLOpenWorldReview5.fxml"));

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
