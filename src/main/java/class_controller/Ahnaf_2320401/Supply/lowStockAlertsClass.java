package class_controller.Ahnaf_2320401.Supply;

public class lowStockAlertsClass {
    private String item,outlet;
    private Integer currentQty, minLevel;

    public lowStockAlertsClass(String item, String outlet, Integer currentQty, Integer minLevel) {
        this.item = item;
        this.outlet = outlet;
        this.currentQty = currentQty;
        this.minLevel = minLevel;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getOutlet() {
        return outlet;
    }

    public void setOutlet(String outlet) {
        this.outlet = outlet;
    }

    public Integer getCurrentQty() {
        return currentQty;
    }

    public void setCurrentQty(Integer currentQty) {
        this.currentQty = currentQty;
    }

    public Integer getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    @Override
    public String toString() {
        return "lowStockAlertsClass{" +
                "item='" + item + '\'' +
                ", outlet='" + outlet + '\'' +
                ", currentQty=" + currentQty +
                ", minLevel=" + minLevel +
                '}';
    }
}