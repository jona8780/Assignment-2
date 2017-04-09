/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Jonah Jones
 */
public class Assignment2 extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        
        //This will create an object that can load our FXML file
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("PurchaseProducts.fxml"));
        
        AnchorPane vendingMachinePane = loader.load();
        
        Scene scene = new Scene(vendingMachinePane);
        
        primaryStage.setTitle("Vending Machine Pad");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
