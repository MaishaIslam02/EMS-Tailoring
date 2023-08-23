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
public class MCus {
      private int MID,CustomerId,MeasurementId;

    public MCus(int MID,int CustomerId, int MeasurementId)
    {
        this.MID=MID;
        this.CustomerId=CustomerId;
        this.MeasurementId=MeasurementId;
    }
    public int getMID(){
        return MID;
    }
    public int getCustomerId(){
        return CustomerId;
    }
    public int getMeasurementId(){
        return MeasurementId;
    }
    
}
