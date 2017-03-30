/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;

/**
 *
 * @author Jonah Jones
 */
public class VendingMachine {
    
    private int maxNumberOfProducts;
    private ArrayList<Product> listOfProducts, listOfEmptyProducts;
    
    public VendingMachine(int maxNumberOfProducts ) {
        
        listOfProducts = new ArrayList<Product>();
        listOfEmptyProducts = new ArrayList<Product>();
    }
    
    public void addProduct(Product product) throws InvalidProductException {
        
        if (product.getQuantity() >  0)
            if (listOfProducts.size() < maxNumberOfProducts)
                listOfProducts.add(product);
            else
                throw new InvalidProductException("You have reached the maximum number of products in the vending machine");
        else
            throw new InvalidProductException("You can't add a Product with a 0 quantity");
    }
    
    public void addEmptyProduct(Product product) {
        
        if (product.getQuantity() == 0)
            listOfEmptyProducts.add(product);
        else {
        }
    }
    
    public void addProductQuantity(Product product) {
        
        if (product.getQuantity() > 0)
            listOfEmptyProducts.remove(product);
        else{
        }
    }

    public int getMaxNumberOfProducts() {
        return maxNumberOfProducts;
    }

    public void setMaxNumberOfProducts(int maxNumberOfProducts) {
        if (maxNumberOfProducts > 0)
            this.maxNumberOfProducts = maxNumberOfProducts;
        else
            throw new IllegalArgumentException("Max number of products must be greater than 0");
    }
    
    public ArrayList<Product> getProducts() {
        return listOfProducts;
    }
    
    public ArrayList<Product> getEmptyProducts() {
        return listOfEmptyProducts;
    }
    
    public String showProductList() {
        
        String classList = "";
        for(int i=0;i<listOfProducts.size();i++)
        {
            classList += String.format("%s%n",listOfProducts.get(i).toString());
        }
        
        return classList;
    }
    
    public String showEmptyProductList() {
        
        String classList = "";
        for(int i=0;i<listOfEmptyProducts.size();i++)
        {
            classList += String.format("%s%n",listOfEmptyProducts.get(i).toString());
        }
        
        return classList;
    }
}
