package com.hexaware.MLP337.model;

public class Vendor {
    private int vendorid;
    private int orderid;
    private String vendorstatus;

    public Vendor(){

    }
    public Vendor(int vendorid){
        this.vendorid = vendorid;
    }


    public Vendor(int vendorid,int orderid,String vendorstatus){
        this.vendorid = vendorid;
        this.orderid = orderid;
        this.vendorstatus=vendorstatus;
        
    }

    public int getvendorid(){
        return this.vendorid;
    }

    public void setvendorid(int vendorid){
        this.vendorid = vendorid;

    }


    public int getorderid(){
        return this.orderid;
    }

    public void setorderid(int orderid){
        this.orderid = orderid;
    }
    public String getvendorstatus(){
        return this.vendorstatus;
    }
    public void setvendorstatus(String vendorstatus){
        this.vendorstatus = vendorstatus;

    }
    
    public int hashcode(){
        return vendorid;
    }
    @Override
    public boolean equals(Object another){
        boolean isItSame=false;
        Vendor vendor=null;
        if(another != null){
        if(this.getClass()==another.getClass()){
            vendor =(Vendor)another;
                if(this.vendorid==vendor.vendorid && this.orderid==vendor.orderid 
                && this.vendorstatus.equals(vendor.vendorstatus)){
                    isItSame= true;
                }
            }

        }
        return isItSame;
    }

    

    public String toString(){
        return "\nvendorid: " + this.vendorid + "\n" +
                "orderid: " + this.orderid + "\n" +
                "vendorstatus:"+this.vendorstatus+"\n"+
                "===============================================";
    }
}