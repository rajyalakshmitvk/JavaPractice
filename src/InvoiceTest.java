import java.io.IOException;
class Invoice
{
    String partnumber;
    String partdescription;
    int quantity;
    double price;
    double amount;
    Invoice(String num,String desc,int quant,double price)
    {
        partnumber=num;
        partdescription=desc;
        quantity=quant;
        this.price=price;
    }
    public String getPartNumber()
    {
        return partnumber;
    }
    public String getPartDescription()
    {
        return partdescription;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPartNumber(String num)
    {
        partnumber=num;
    }
    public void setPartDescription(String des)
    {
        partdescription=des;

    }
    public void setQuantity(int numitem)
    {
        quantity=numitem;
    }
    public void setPrice(double price )
    {
        this.price=price;
    }
    public double getInvoiceAmount()
    {
        amount = price*quantity;
        amount = (amount>0)?amount:0;
        return amount;
    }
    public void displayInfo()
    {
        System.out.println("part number: "+partnumber);
        System.out.println("part description: "+partdescription);
        System.out.println("number_of_items: "+quantity);
        System.out.println("price_of_items: "+price);
        System.out.println("\n Invoice Amount :"+amount);
        System.out.println("---------------------------------------");
    }
}
public class InvoiceTest
{
    public static void main(String [] args)throws IOException
    {
        Invoice inv1;
        inv1 = new Invoice("Spawner","Tool",10,250.00);
        Invoice inv2;
        inv2 = new Invoice("Rinch","Tool",20,155.00);
        inv1.displayInfo();
        inv2.setPartNumber("Hammer");
        inv2.setPartDescription("Tool");
        inv2.setQuantity(12);
        inv2.setPrice(212);
        inv2.getInvoiceAmount();
        inv2.displayInfo();
    }
}
