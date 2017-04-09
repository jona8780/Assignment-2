/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jonah Jones
 */
public class PurchaseProductsController implements Initializable {

    @FXML private Button AButton;
    @FXML private Button BButton;
    @FXML private Button CButton;
    @FXML private Button DButton;
    @FXML private Button EButton;
    @FXML private Button FButton;
    @FXML private Button GButton;
    @FXML private Button HButton;
    @FXML private Button oneButton;
    @FXML private Button twoButton;
    @FXML private Button threeButton;
    @FXML private Button fourButton;
    @FXML private Button fiveButton;
    @FXML private Button sixButton;
    @FXML private Button sevenButton;
    @FXML private Button eightButton;
    @FXML private Button nineButton;
    @FXML private Button tenButton;
    @FXML private Button clearButton;
    @FXML private Button submitButton;
    @FXML private TextField display;
    @FXML private Button createNewProductButton;
    @FXML private Button viewDetailButton;
    @FXML private Button restockButtone;
    @FXML private Button deleteProductButton;
    @FXML private Label infoField;
    @FXML private TableView<Product> tableView;
    @FXML private TableColumn<Product, String> nameColumn;
    @FXML private TableColumn<Product, Integer> quantityColumn;
    
    
    private String codeEntered;
    private VendingMachine vendingMachine;
    
    public void buttonPushed(ActionEvent event) {
        
        String buttonValue = ((Button)event.getSource()).getText();
        
   
        if (codeEntered.matches("")) {
            if (buttonValue.matches("[A-H]")) {
                codeEntered = codeEntered + buttonValue;
                display.setText(codeEntered);
            }
        }
        else if (codeEntered.matches("[A-H]")) {
            if (buttonValue.matches("[1-9]||10")) {
                codeEntered = codeEntered + buttonValue;
                display.setText(codeEntered);
            }
        }
        else
            throw new IllegalArgumentException("This isnt a valid code");
    }
    
    public void clearButtonPushed(ActionEvent event) {
        display.setText("");
        codeEntered="";
    }
    
    public void submitButtonPushed(ActionEvent event) {
        
        display.setText("DISPENCING " + codeEntered);
    }
    
    public void restockButtonPushed(ActionEvent event) {
        
    }
        
    public void createNewProductButtonPushed(ActionEvent event) throws IOException {
        
        Parent createNewProduct = FXMLLoader.load(getClass().getResource("CreateNewProduct.fxml"));
        Scene tableViewScene = new Scene(createNewProduct);
        
        //This line gets the Stage information
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(tableViewScene);
        window.show();
    }
    
     public void deleteButtonPushed()
    {
        ObservableList<Product> selectedRows, allProducts;
        allProducts = tableView.getItems();
        
        //this gives us the rows that were selected
        selectedRows = tableView.getSelectionModel().getSelectedItems();
        
        //loop over the selected rows and remove the Person objects from the table
        for (Product product: selectedRows)
        {
            allProducts.remove(product);
        }
    }
    
    public void viewDetailsButtonPushed(ActionEvent event) {
        
    }
    
    /*
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        display.setText("");
        codeEntered="";
        nameColumn.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
        quantityColumn.setCellValueFactory(new PropertyValueFactory<Product, Integer>("quantity"));
        vendingMachine = new VendingMachine(20);
        tableView.setItems(getProducts());
        
    }    
    
    public ObservableList<Product> getProducts() {
        
        ObservableList<Product> products = FXCollections.observableArrayList(vendingMachine.listOfProducts);
        vendingMachine.listOfProducts.add(new Product("Oh Henry", "B4", 462, 10, 7, 1.50));
        vendingMachine.listOfProducts.add(new Product("Kit Kat", "B5", 518, 10, 5, 1.50));
        vendingMachine.listOfProducts.add(new Product("Lays Original", "A1", 160, 8, 3, 2.00));
        vendingMachine.listOfProducts.add(new Product("M&M's Peanut Chocolate Candies", "D2", 62, 20, 13, 0.50));
        vendingMachine.listOfProducts.add(new Product("Coffee Crisp", "B6", 260, 10, 0, 1.50));
        
        return products;
    }
}
