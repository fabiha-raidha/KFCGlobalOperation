package class_controller.Ahnaf_2320401.Supply;

import java.time.LocalDate;

public class purchaseOrderClass {
    private String supplier,status,deliveryLocation;
    private int poNumber;
    private LocalDate date;
    private double total;
    private LocalDate deliveryDate;

    public purchaseOrderClass(int poNumber, String supplier, LocalDate date, double total, String status, String deliveryLocation, LocalDate deliveryDate) {
        this.poNumber = poNumber;
        this.supplier = supplier;
        this.date = date;
        this.total = total;
        this.status = status;
        this.deliveryLocation = deliveryLocation;
        this.deliveryDate = deliveryDate;
    }

    public int getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(int poNumber) {
        this.poNumber = poNumber;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "purchaseOrderClass{" +
                "poNumber=" + poNumber +
                ", supplier='" + supplier + '\'' +
                ", date=" + date +
                ", total=" + total +
                ", status='" + status + '\'' +
                ", deliveryLocation='" + deliveryLocation + '\'' +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}