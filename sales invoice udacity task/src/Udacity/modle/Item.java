

//class of sigItem which store in item name, unit price, quantity and links the invoice with it 


package Udacity.modle;
/**
 *
 * @author ahmed
 */
public class Item {
    private HeadInvoice invoice;
    private String itemName;
    private double unitPrice;
    private int quantity;

    public Item() {
    }

    public Item(String itemName, int quantity,double unitPrice,HeadInvoice header) {
        this.invoice= header;
        this.quantity = quantity;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
    }
     public double getTotalLine(){
        return unitPrice * quantity;
    }



    public HeadInvoice getInvoice() {
        return invoice;
    }

    public void setInvoice(HeadInvoice invoice) {
        this.invoice = invoice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "sigItem{" + "itemName=" + itemName + ", unitPrice=" + unitPrice + ", quantity=" + quantity + '}';
    }
    public double getTotal(){
        return unitPrice * quantity;
    }

   public String getItemsFromTabel(){
       return invoice.getNum() + "," + itemName + "," + unitPrice + "," +quantity;
   }

   
    
}
