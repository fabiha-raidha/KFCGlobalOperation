package class_controller.Ahnaf_2320401.Supply;

public class supplierReportClass {
    private String metric;
    private int value;
    private String remarks;

    public supplierReportClass(String metric, int value, String remarks) {
        this.metric = metric;
        this.value = value;
        this.remarks = remarks;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "supplierReportClass{" +
                "metric='" + metric + '\'' +
                ", value=" + value +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}