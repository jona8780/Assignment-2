/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Jonah Jones
 */
public class Product {
    
    private String name, type, code;
    private int calories, quantity, maxQuantity;
    private double cost;
    
    /**
     * Creates a instance of a Product.
     * @param name
     * @param type
     * @param code
     * @param calories
     * @param quantity
     * @param maxQuantity
     * @param cost 
     */
    public Product(String name, String type, String code, int calories, int quantity, int maxQuantity, double cost) {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public String toString() {
        return name + " " + code + " is " + cost;
    }
}
