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
public class Tailor {
         private int TailorId, Phone, SYear,OrderId,TDProducts;
    private String FirstName,LastName, Email ;
    public Tailor(int TailorId,int Phone,int OrderId,int SYear,int TDProducts,String FirstName,String LastName,String Email)
    {   this.TailorId=TailorId;
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.Email=Email;
        this.Phone= Phone;
        this.SYear= SYear;
        this.OrderId=OrderId;
        this.TDProducts= TDProducts;
;
        
    }
    public int getTailorId(){
        return TailorId;
    }
    public String getFirstName(){
        return FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getEmail(){
        return Email;
    }
    public int getPhone(){
        return Phone;
    }
    public int getSYear(){
        return SYear;
    }
    public int getOrderId(){
        return OrderId;
    }
    public int getTDProducts(){
        return TDProducts;
    }
         
    
}
