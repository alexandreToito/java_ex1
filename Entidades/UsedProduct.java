package Entidades;

import java.util.Date;

public class UsedProduct extends Product {

    private Date manuDate;

    public UsedProduct(){
        super();
    }
    
    public UsedProduct(String name, double price, Date manuDate){
        super(name, price);
        this.manuDate = manuDate;
    }

    public Date getManuDate(){
        return manuDate;
    }

    public void setManuDate(Date manuDate){
        this.manuDate = manuDate;
    }

    @Override
    public String toString(){
        return getName()
                + " $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + manuDate
                + " )";
    }
}