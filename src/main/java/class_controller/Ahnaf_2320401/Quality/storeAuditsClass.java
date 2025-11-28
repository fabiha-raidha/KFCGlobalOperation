package class_controller.Ahnaf_2320401.Quality;

import java.time.LocalDate;

public class storeAuditsClass {
    private Integer auditId;
    private String store, auditor, status;
    private LocalDate date;
    private Double score;

    public storeAuditsClass(Integer auditId, String store, LocalDate date, Double score, String status, String auditor) {
        this.auditId = auditId;
        this.store = store;
        this.date = date;
        this.score = score;
        this.status = status;
        this.auditor = auditor;
    }

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    @Override
    public String toString() {
        return "storeAuditsClass{" +
                "auditId=" + auditId +
                ", store='" + store + '\'' +
                ", date=" + date +
                ", score=" + score +
                ", status='" + status + '\'' +
                ", auditor='" + auditor + '\'' +
                '}';
    }
}

