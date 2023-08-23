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
public class Orders {
     private int OrderId, CustomerId, ProductId;
    private String OrderName,OrderPlacementDate,OrderState,OrderPrice,Gender,Order_Due_Date ;
    public Orders(int OrderId,int CustomerId,int ProductId,String OrderName,String OrderPlacementDate,String OrderState, String OrderPrice,String Gender, String Order_Due_Date)
    {   this.OrderId=OrderId;
        this.OrderName=OrderName;
        this.CustomerId=CustomerId;
        this.ProductId= ProductId;
        this.OrderPlacementDate=OrderPlacementDate;
        this.OrderState =OrderState;
        this.OrderPrice=OrderPrice;
        this.Gender= Gender;
        this.Order_Due_Date=Order_Due_Date;
        
    }
    public int getOrderId(){
        return OrderId;
    }
    public String getOrderName(){
        return OrderName;
    }
    public int getCustomerId(){
        return CustomerId;
    }
    public int getProductId(){
        return ProductId;
    }
    public String getOrderPlacementDate(){
        return OrderPlacementDate;
    }
    public String getOrderState(){
        return OrderState;
    }
    public String getOrderPrice(){
        return OrderPrice;
    }
    public String getGender(){
        return Gender;
    }
  
    public String getOrder_Due_Date(){
        return Order_Due_Date;
    }
    
}
