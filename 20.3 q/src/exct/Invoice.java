package exct;

public class Invoice {
    String number;
    String description;
    int quantity;
    double price;

    public Invoice(String number, String description, int quantity, double price){
        this.number=number;
        this.description=description;
        this.quantity=quantity;
        this.price=price;
    }

    public void setNumber(String number){
        this.number=number;
    }
    public String getNumber(){
        return number;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
        if (quantity<0){
            quantity=0;
        }
    }
    public int getQuantity(){
        return quantity;
    }
    public void setPrice(double price){
        this.price=price;
        if (price<0.0){
            price=0.0;
        }
    }
    public double getPrice(){
        return price;
    }

    public double getInvoice(){
        double invoiceAmount;
        invoiceAmount=price*quantity;
        return invoiceAmount;
    }


}
class invoiceTest{
    public static void main(String[] args){
        Invoice q1 = new Invoice("1","ABc",2,250.00);
        System.out.println(q1.getInvoice());

    }
}

