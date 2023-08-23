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
public class Measure {
         private int MeasurementId, ProductId;
         private float Waist,Bust, Sleeve, Shoulder,Neck,Length;
    
    public Measure(int MeasurementId,int ProductId,float Waist, float Bust, float Sleeve, float Shoulder, float Neck, float Length)
    {   this.MeasurementId=MeasurementId;
        this.ProductId=ProductId;
        this.Waist=Waist;
        this.Bust=Bust;
        this.Sleeve =Sleeve;
        this.Shoulder=Shoulder;
        this.Neck= Neck;
        this.Length= Length;
        
    }
    public int getMeasurementId(){
        return MeasurementId;
    }
    public int getProductId(){
        return ProductId;
    }
    public float getWaist(){
        return Waist;
    }
    public float getBust(){
        return Bust;
    }
    public float getSleeve(){
        return Sleeve;
    }
    public float getShoulder(){
        return Shoulder;
    }
    public float getNeck(){
        return Neck;
    }
    public float getLength(){
        return Length;
    }
   
       
    
}
