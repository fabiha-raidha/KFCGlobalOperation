package class_controller.Marzana_2432038.StoreManager;

public class salesManagementClass {

        private String salesId , date , product , paymentMethod , status , customerId ;
        private  int quantity;
        private double unitPrice , totalamount;

    public salesManagementClass(String salesId, String date, String product, String paymentMethod, String status, String customerId, int quantity, double unitPrice, double totalamount) {
        this.salesId = salesId;
        this.date = date;
        this.product = product;
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.customerId = customerId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalamount = totalamount;
    }

    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(double totalamount) {
        this.totalamount = totalamount;
    }

    @Override
    public String toString() {
        return "salesManagementClass{" +
                "salesId='" + salesId + '\'' +
                ", date='" + date + '\'' +
                ", product='" + product + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", status='" + status + '\'' +
                ", customerId='" + customerId + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalamount=" + totalamount +
                '}';
    }
}
