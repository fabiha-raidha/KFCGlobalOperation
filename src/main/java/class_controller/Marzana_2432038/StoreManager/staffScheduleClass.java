package class_controller.Marzana_2432038.StoreManager;

import java.time.LocalDate;
import java.time.LocalTime;

public class staffScheduleClass {
    private String staffId, name , role , status;
    private LocalDate shiftDate;
    private LocalTime startTime , endTime ;

    public staffScheduleClass(String staffId, String name, String role, String status, LocalDate shiftDate, LocalTime startTime, LocalTime endTime) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
        this.status = status;
        this.shiftDate = shiftDate;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getShiftDate() {
        return shiftDate;
    }

    public void setShiftDate(LocalDate shiftDate) {
        this.shiftDate = shiftDate;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "staffScheduleClass{" +
                "staffId='" + staffId + '\'' +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", status='" + status + '\'' +
                ", shiftDate=" + shiftDate +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}


