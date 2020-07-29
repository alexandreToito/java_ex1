package Entidades;

public class ImportedProduct extends Product {

    private Double customFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, double price, double customFee){
        super(name, price);
        this.customFee = customFee;
    }

    public double getCustomFee(){
        return customFee;
    }
    
    public void setCustomFee(double fee){
        customFee = fee;
    }

    public double totalPrice(){
        return getPrice() * customFee;
    }

    public String toString(){
        return getName()
                + " $ "
                + String.format("%.2f", getPrice())
                + " (Customs fee: "
                + customFee
                + " )";
    }  
}