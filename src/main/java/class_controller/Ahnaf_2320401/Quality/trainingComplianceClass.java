package class_controller.Ahnaf_2320401.Quality;

import java.time.LocalDate;

public class trainingComplianceClass {
    private String staffMember, role, requiredModules, complianceStatus;
    private LocalDate lastTrainedDate, expiryDate;

    public trainingComplianceClass(String staffMember, String role, String requiredModules,
                                   LocalDate lastTrainedDate, LocalDate expiryDate, String complianceStatus) {
        this.staffMember = staffMember;
        this.role = role;
        this.requiredModules = requiredModules;
        this.lastTrainedDate = lastTrainedDate;
        this.expiryDate = expiryDate;
        this.complianceStatus = complianceStatus;
    }

    public String getStaffMember() {
        return staffMember;
    }

    public void setStaffMember(String staffMember) {
        this.staffMember = staffMember;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRequiredModules() {
        return requiredModules;
    }

    public void setRequiredModules(String requiredModules) {
        this.requiredModules = requiredModules;
    }

    public LocalDate getLastTrainedDate() {
        return lastTrainedDate;
    }

    public void setLastTrainedDate(LocalDate lastTrainedDate) {
        this.lastTrainedDate = lastTrainedDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getComplianceStatus() {
        return complianceStatus;
    }

    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    @Override
    public String toString() {
        return "trainingComplianceClass{" +
                "staffMember='" + staffMember + '\'' +
                ", role='" + role + '\'' +
                ", requiredModules='" + requiredModules + '\'' +
                ", lastTrainedDate=" + lastTrainedDate +
                ", expiryDate=" + expiryDate +
                ", complianceStatus='" + complianceStatus + '\'' +
                '}';
    }
}

