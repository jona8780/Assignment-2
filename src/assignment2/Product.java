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
    
    private String name, code;
    private int calories, quantity, maxQuantity;
    private double cost;
    
    /**
     * Creates a instance of a Product.
     * @param name
     * @param code
     * @param calories
     * @param quantity
     * @param maxQuantity
     * @param cost 
     */
    public Product(String name, String code, int calories, int quantity, int maxQuantity, double cost) {
        setName(name);
        setCode(code);
        setCalories(calories);
        setQuantity(quantity);
        setMaxQuantity(maxQuantity);
        setCost(cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        
        if (code.length() == 2) {
            code = code.toUpperCase();
            if (code.matches("[A-Z][0-9]"))
                this.code = code;
            else
                throw new IllegalArgumentException("Must be a valid code Ex.D4, A2");
        }
        else
            throw new IllegalArgumentException("Must be 2 characters long");
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        
        if (calories >= 0)
            this.calories = calories;
        else
            throw new IllegalArgumentException("Must not be less than 0");
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        
        if (quantity <= maxQuantity && quantity >= 0)
            this.quantity = quantity;
        else
            throw new IllegalArgumentException("Must be between 0 and max quantity");
    }

    public int getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(int maxQuantity) {
        
        if (maxQuantity > 0)
            this.maxQuantity = maxQuantity;
        else
            throw new IllegalArgumentException("Must be greater than 0");
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        
        if (cost > 0)
            this.cost = cost;
        else
            throw new IllegalArgumentException("Must be greater than 0");
    }
    
    public String toString() {
        return code + " " + name + " is $" + cost;
    }
}
