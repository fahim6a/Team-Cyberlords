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
public class FXMLSimulationGamesController implements Initializable {

    @FXML
    private Button SimulationBackButton;
    @FXML
    private Button SimulationDownloadButton1;
    @FXML
    private Button SimulationDownloadButton2;
    @FXML
    private Button SimulationDownloadButton3;
    @FXML
    private Button SimulationDownloadButton4;
    @FXML
    private Button SimulationDownloadButton5;
    @FXML
    private Button simulationReviewButton1;
    @FXML
    private Button simulationReviewButton2;
    @FXML
    private Button simulationReviewButton3;
    @FXML
    private Button simulationReviewButton4;
    @FXML
    private Button simulationReviewButton5;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleSimulationBackButton(ActionEvent event) throws IOException {
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
    private void handleSimulationDownloadButton1(ActionEvent event) {
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://play.google.com/store/apps/details?id=eu.nordeus.topeleven.android"));
        } catch (IOException err) {
        } catch (URISyntaxException err) {

        }
    }

    @FXML
    private void handleSimulationDownloadButton2(ActionEvent event) {
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.crime.city.sneak.thief.simulator.games"));
        } catch (IOException err) {
        } catch (URISyntaxException err) {

        }
    }

    @FXML
    private void handleSimulationDownloadButton3(ActionEvent event) {
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.ea.game.simcitymobile_row"));
        } catch (IOException err) {
        } catch (URISyntaxException err) {

        }
    }

    @FXML
    private void handleSimulationDownloadButton4(ActionEvent event) {
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.gameinsight.transportempiregp"));
        } catch (IOException err) {
        } catch (URISyntaxException err) {

        }
    }

    @FXML
    private void handleSimulationDownloadButton5(ActionEvent event) {
        Desktop browser = Desktop.getDesktop();
        try {
            browser.browse(new URI("https://play.google.com/store/apps/details?id=com.gamevil.SlightlyMadStudiosPogo.android.google.global.normal"));
        } catch (IOException err) {
        } catch (URISyntaxException err) {

        }
    }

    @FXML
    private void handleSimulationBackButton1(ActionEvent event) {
         try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLSimulationReview1.fxml"));

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
    private void handleSimulationBackButton2(ActionEvent event) {
          try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLSimulationReview2.fxml"));

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
    private void handleSimulationBackButton3(ActionEvent event) {
          try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLSimulationReview3.fxml"));

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
    private void handleSimulationBackButton4(ActionEvent event) {
          try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLSimulationReview4.fxml"));

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
    private void handleSimulationBackButton5(ActionEvent event) {
          try {
            Parent root= FXMLLoader.load(getClass().getResource("FXMLSimulationReview5.fxml"));

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
