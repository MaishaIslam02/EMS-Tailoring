/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems_tailoring;

/**
 *
 * @author Asus
 */
class Product {
    private int ProductId,Total_Number_of_Products;
    private String ProductName,Gender_Of_Customer ;
    public Product(int ProductId,int TotalNumberofProducts,String ProductName,String GenderofCustomer)
    {
        this.ProductId=ProductId;
        this.ProductName=ProductName;
        this.Total_Number_of_Products=TotalNumberofProducts;
        this.Gender_Of_Customer =GenderofCustomer;
    }
    public int getProductId(){
        return ProductId;
    }
    public String getProductName(){
        return ProductName;
    }
    public int getTotal_Number_of_Products(){
        return Total_Number_of_Products;
    }
    public String getGender_Of_Customer(){
        return Gender_Of_Customer;
    }
    
}
