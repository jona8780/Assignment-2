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
    public ArrayList<Product> listOfProducts;
    
    public VendingMachine(int maxNumberOfProducts ) {
        
        setMaxNumberOfProducts(maxNumberOfProducts);
        listOfProducts = new ArrayList<Product>();
    }
    
    public void addProduct(Product product) throws InvalidProductException {
        

        if (listOfProducts.size() < maxNumberOfProducts)
            listOfProducts.add(product);
        else
            throw new InvalidProductException("You have reached the maximum number of products in the vending machine");
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
    
    public int getNumberOfProducts() {
        return listOfProducts.size();
    }
    
    public ArrayList<Product> getProducts() {
        return listOfProducts;
    }
    
    public String showProductList() {
        
        String classList = "";
        for(int i=0;i<listOfProducts.size();i++)
        {
            classList += String.format("%s%n",listOfProducts.get(i).toString());
        }
        
        return classList;
    }
}
