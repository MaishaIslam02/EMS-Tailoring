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
public class Customers {
     private int CustomerId, Phone, ProductId;
    private String FirstName,LastName,Address, Email,Gender,Order_Due_Date ;
    public Customers(int CustomerId,int Phone,int ProductId,String FirstName,String LastName,String Address,String Email, String Gender, String Order_Due_Date)
    {   this.CustomerId=CustomerId;
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Address =Address;
        this.Email=Email;
        this.Phone= Phone;
        this.Gender= Gender;
        this.ProductId=ProductId;
        this.Order_Due_Date=Order_Due_Date;
        
    }
    public int getCustomerId(){
        return CustomerId;
    }
    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getAddress(){
        return Address;
    }
    public String getEmail(){
        return Email;
    }
    public int getPhone(){
        return Phone;
    }
    public String getGender(){
        return Gender;
    }
    public int getProductId(){
        return ProductId;
    }
    public String getOrder_Due_Date(){
        return Order_Due_Date;
    }
                
    
}
