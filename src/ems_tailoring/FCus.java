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
public class FCus {
        private int FID,CustomerId,MeasurementId;

    public FCus(int FID,int CustomerId, int MeasurementId)
    {
        this.FID=FID;
        this.CustomerId=CustomerId;
        this.MeasurementId=MeasurementId;
    }
    public int getFID(){
        return FID;
    }
    public int getCustomerId(){
        return CustomerId;
    }
    public int getMeasurementId(){
        return MeasurementId;
    }
  
}
