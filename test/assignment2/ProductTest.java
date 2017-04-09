/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jonah Jones
 */
public class ProductTest {
    
    Product validProduct;
    
    public ProductTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        validProduct = new Product("Lays Original", "A2", 100, 6, 3, 2.50);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class Product.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "Lays Original";
        String result = validProduct.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Product.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "KitKat";
        validProduct.setName(name);
        assertEquals(name, validProduct.getName());
    }

    /**
     * Test of getCode method, of class Product.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        String expResult = "A2";
        String result = validProduct.getCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCode method, of class Product.
     */
    @Test
    public void testSetCode() {
        System.out.println("setCode");
        String code = "F8";
        validProduct.setCode(code);
        assertEquals(code, validProduct.getCode());
    }
    
    /**
     * Test of setCode method, of class Product.
     */
    @Test
    public void testSetCodeInvalid1() {
        
        try {
            System.out.println("setCode");
            String code = "F88";
            validProduct.setCode(code);
            assertEquals(code, validProduct.getCode());
        }
        catch (Exception e){
            System.out.printf("\"%s\"%n",e.getMessage());
        }
    }
    /**
     * Test of setCode method, of class Product.
     */
    @Test
    public void testSetCodeInvalid2() {
        
        try {
            System.out.println("setCode");
            String code = "8F";
            validProduct.setCode(code);
            assertEquals(code, validProduct.getCode());
        }
        catch (Exception e){
            System.out.printf("\"%s\"%n",e.getMessage());
        }
    }

    /**
     * Test of getCalories method, of class Product.
     */
    @Test
    public void testGetCalories() {
        System.out.println("getCalories");
        int expResult = 100;
        int result = validProduct.getCalories();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCalories method, of class Product.
     */
    @Test
    public void testSetCalories() {
        System.out.println("setCalories");
        int calories = 150;
        validProduct.setCalories(calories);
        assertEquals(calories, validProduct.getCalories());
    }
    
    /**
     * Test of setCalories method, of class Product.
     */
    @Test
    public void testSetCaloriesInvalid() {
        
        try {
            System.out.println("setCalories");
        int calories = -150;
        validProduct.setCalories(calories);
        assertEquals(calories, validProduct.getCalories());
        }
        catch (Exception e){
            System.out.printf("\"%s\"%n",e.getMessage());
        }
    }

    /**
     * Test of getQuantity method, of class Product.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        int expResult = 3;
        int result = validProduct.getQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuantity method, of class Product.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 4;
        validProduct.setQuantity(quantity);
        assertEquals(quantity, validProduct.getQuantity());
    }
    
    /**
     * Test of setQuantity method, of class Product.
     */
    @Test
    public void testSetQuantityInvalid1() {
        
        try {
        System.out.println("setQuantity");
        int quantity = 8;
        validProduct.setQuantity(quantity);
        assertEquals(quantity, validProduct.getQuantity());
        }
        catch (Exception e){
            System.out.printf("\"%s\"%n",e.getMessage());
        }
    }
    
    /**
     * Test of setQuantity method, of class Product.
     */
    @Test
    public void testSetQuantityInvalid2() {
        
        try {
        System.out.println("setQuantity");
        int quantity = -1;
        validProduct.setQuantity(quantity);
        assertEquals(quantity, validProduct.getQuantity());
        }
        catch (Exception e){
            System.out.printf("\"%s\"%n",e.getMessage());
        }
    }

    /**
     * Test of getMaxQuantity method, of class Product.
     */
    @Test
    public void testGetMaxQuantity() {
        System.out.println("getMaxQuantity");
        int expResult = 6;
        int result = validProduct.getMaxQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaxQuantity method, of class Product.
     */
    @Test
    public void testSetMaxQuantity() {
        System.out.println("setMaxQuantity");
        int maxQuantity = 5;
        validProduct.setMaxQuantity(maxQuantity);
        assertEquals(maxQuantity, validProduct.getMaxQuantity());
    }
    
    /**
     * Test of setMaxQuantity method, of class Product.
     */
    @Test
    public void testSetMaxQuantityInvalid() {
        
        try {
        System.out.println("setMaxQuantity");
        int maxQuantity = -5;
        validProduct.setMaxQuantity(maxQuantity);
        assertEquals(maxQuantity, validProduct.getMaxQuantity());
        }
        catch (Exception e){
            System.out.printf("\"%s\"%n",e.getMessage());
        }        
    }


    /**
     * Test of getCost method, of class Product.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        double expResult = 2.50;
        double result = validProduct.getCost();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of setCost method, of class Product.
     */
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        double cost = 2.75;
        validProduct.setCost(cost);
        assertEquals(cost, validProduct.getCost(), 0);
    }
    
    /**
     * Test of setCost method, of class Product.
     */
    @Test
    public void testSetCostInvalid() {
        try {
            System.out.println("setCost");
            double cost = -2.75;
            validProduct.setCost(cost);
            assertEquals(cost, validProduct.getCost(), 0);
        }
        catch (Exception e){
            System.out.printf("\"%s\"%n",e.getMessage());
        } 
        
    }

    /**
     * Test of toString method, of class Product.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "A2, Lays Original's are $2.50 and have 100 calories";
        String result = validProduct.toString();
        assertEquals(expResult, result);
    }
    
}
