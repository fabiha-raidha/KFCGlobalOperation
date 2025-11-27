package class_controller.Ahnaf_2320401.Supply;

public class supplierClass {
    private int supplierId , contact;
    private String name, category,email;
    private boolean status;

    public supplierClass(int supplierId, int contact, String name, String category, String email, boolean status) {
        this.supplierId = supplierId;
        this.contact = contact;
        this.name = name;
        this.category = category;
        this.email = email;
        this.status = status;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "supplierClass{" +
                "supplierId=" + supplierId +
                ", contact=" + contact +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                '}';
    }
}