package class_controller.Ahnaf_2320401.Supply;

public class stockTransfersClass {
    private int transferId, quantity;
    private String fromOutlet,toOutlet,items;
    private String status;

    public stockTransfersClass(int transferId, int quantity, String fromOutlet, String toOutlet, String items, String status) {
        this.transferId = transferId;
        this.quantity = quantity;
        this.fromOutlet = fromOutlet;
        this.toOutlet = toOutlet;
        this.items = items;
        this.status = status;
    }

    public int getTransferId() {
        return transferId;
    }

    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFromOutlet() {
        return fromOutlet;
    }

    public void setFromOutlet(String fromOutlet) {
        this.fromOutlet = fromOutlet;
    }

    public String getToOutlet() {
        return toOutlet;
    }

    public void setToOutlet(String toOutlet) {
        this.toOutlet = toOutlet;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "stockTransfersClass{" +
                "transferId=" + transferId +
                ", quantity=" + quantity +
                ", fromOutlet='" + fromOutlet + '\'' +
                ", toOutlet='" + toOutlet + '\'' +
                ", items='" + items + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}