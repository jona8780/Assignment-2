/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
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
public class VendingMachineTest {
    
    private Product product1, product2, product3, product4, emptyProduct;
    private VendingMachine validVendingMachine;
    
    public VendingMachineTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws InvalidProductException {
        product1 = new Product("Oh Henry", "B4", 462, 10, 7, 1.50);
        product2 = new Product("Kit Kat", "B5", 518, 10, 5, 1.50);
        product3 = new Product("Lays Original", "A1", 160, 8, 3, 2.00);
        product4 = new Product("M&M's Peanut Chocolate Candies", "D2", 62, 20, 13, 0.50);
        
        emptyProduct = new Product("Coffee Crisp", "B6", 260, 10, 0, 1.50);
        
        validVendingMachine = new VendingMachine(10);
        validVendingMachine.addProduct(product1);
        validVendingMachine.addProduct(product2);
        validVendingMachine.addProduct(product3);
        validVendingMachine.addProduct(product4);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addProduct method, of class VendingMachine.
     */
    @Test
    public void testAddProduct() throws Exception {
        int products = validVendingMachine.getNumberOfProducts()+1;
        validVendingMachine.addProduct(this.product1);
        assertEquals(products, validVendingMachine.getNumberOfProducts()); 
    }
    
    /**
     * Test of addProduct method, of class VendingMachine.
     */
    @Test
    public void testAddProductInvalid() throws Exception {
        validVendingMachine.addProduct(product1);
        validVendingMachine.addProduct(product1);
        validVendingMachine.addProduct(product1);
        validVendingMachine.addProduct(product1);
        validVendingMachine.addProduct(product1);
        validVendingMachine.addProduct(product1);
        try {
            validVendingMachine.addProduct(product1);
        }
        catch (Exception e){
            System.out.printf("\"%s\"%n",e.getMessage());
        }
    }

    /**
     * Test of getMaxNumberOfProducts method, of class VendingMachine.
     */
    @Test
    public void testGetMaxNumberOfProducts() {
        System.out.println("getMaxNumberOfProducts");
        int expResult = 10;
        int result = validVendingMachine.getMaxNumberOfProducts();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMaxNumberOfProducts method, of class VendingMachine.
     */
    @Test
    public void testSetMaxNumberOfProducts() {
        System.out.println("setMaxNumberOfProducts");
        int maxNumberOfProducts = 7;
        validVendingMachine.setMaxNumberOfProducts(maxNumberOfProducts);
        assertEquals(maxNumberOfProducts, validVendingMachine.getMaxNumberOfProducts());
    }

    /**
     * Test of setMaxNumberOfProducts method, of class VendingMachine.
     */
    @Test
    public void testSetMaxNumberOfProductsInvalid() {
        
        try {
        System.out.println("setMaxNumberOfProducts");
        int maxNumberOfProducts = -1;
        validVendingMachine.setMaxNumberOfProducts(maxNumberOfProducts);
        assertEquals(maxNumberOfProducts, validVendingMachine.getMaxNumberOfProducts());
        }
        catch (Exception e){
            System.out.printf("\"%s\"%n",e.getMessage());
        }
    }

    /**
     * Test of getProducts method, of class VendingMachine.
     */
    @Test
    public void testGetProducts() {
        ArrayList<Product> expResult = new ArrayList<>();
        expResult.add(product1);
        expResult.add(product2);
        expResult.add(product3);
        expResult.add(product4);
        ArrayList<Product> result = validVendingMachine.getProducts();
        assertEquals(expResult, result);
    }

    /**
     * Test of showProductList method, of class VendingMachine.
     */
    @Test
    public void testShowProductList() {
        String expResult = String.format("B4, Oh Henry's are $1.50 and have 462 calories%n" +
                           "B5, Kit Kat's are $1.50 and have 518 calories%n" +
                           "A1, Lays Original's are $2.00 and have 160 calories%n" +
                           "D2, M&M's Peanut Chocolate Candies's are $0.50 and have 62 calories%n");
        String result = validVendingMachine.showProductList();
        assertEquals(expResult, result); 
    }

    /**
     * Test of getNumberOfProducts method, of class VendingMachine.
     */
    @Test
    public void testGetNumberOfProducts() {
        System.out.println("getNumberOfProducts");
        int expResult = 4;
        int result = validVendingMachine.getNumberOfProducts();
        assertEquals(expResult, result);
    }
}
