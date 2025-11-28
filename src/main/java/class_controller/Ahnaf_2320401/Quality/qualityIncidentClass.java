package class_controller.Ahnaf_2320401.Quality;

import java.time.LocalDate;

public class qualityIncidentClass {
    private int incidentId, lotNumber;
    private String store, product, type, severity, status, description;
    private LocalDate slaDate;

    public qualityIncidentClass(int incidentId, String store, String product, int lotNumber,
                                 String type, String severity, String status, LocalDate slaDate, String description) {
        this.incidentId = incidentId;
        this.store = store;
        this.product = product;
        this.lotNumber = lotNumber;
        this.type = type;
        this.severity = severity;
        this.status = status;
        this.slaDate = slaDate;
        this.description = description;
    }

    public int getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(int incidentId) {
        this.incidentId = incidentId;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(int lotNumber) {
        this.lotNumber = lotNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getSlaDate() {
        return slaDate;
    }

    public void setSlaDate(LocalDate slaDate) {
        this.slaDate = slaDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "qualityIncidentClass{" +
                "incidentId=" + incidentId +
                ", store='" + store + '\'' +
                ", product='" + product + '\'' +
                ", lotNumber=" + lotNumber +
                ", type='" + type + '\'' +
                ", severity='" + severity + '\'' +
                ", status='" + status + '\'' +
                ", slaDate=" + slaDate +
                ", description='" + description + '\'' +
                '}';
    }
}
