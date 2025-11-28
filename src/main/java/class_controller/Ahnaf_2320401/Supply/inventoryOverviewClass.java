package class_controller.Ahnaf_2320401.Supply;

public class inventoryOverviewClass {
    private String outlet , ingredient, stockWarning ;
    private int currentQty, minLevel;

    public inventoryOverviewClass(String outlet, String ingredient, String stockWarning, int currentQty, int minLevel) {
        this.outlet = outlet;
        this.ingredient = ingredient;
        this.stockWarning = stockWarning;
        this.currentQty = currentQty;
        this.minLevel = minLevel;
    }

    public String getOutlet() {
        return outlet;
    }

    public void setOutlet(String outlet) {
        this.outlet = outlet;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getStockWarning() {
        return stockWarning;
    }

    public void setStockWarning(String stockWarning) {
        this.stockWarning = stockWarning;
    }

    public int getCurrentQty() {
        return currentQty;
    }

    public void setCurrentQty(int currentQty) {
        this.currentQty = currentQty;
    }

    public int getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(int minLevel) {
        this.minLevel = minLevel;
    }

    @Override
    public String toString() {
        return "inventoryOverviewClass{" +
                "outlet='" + outlet + '\'' +
                ", ingredient='" + ingredient + '\'' +
                ", stockWarning='" + stockWarning + '\'' +
                ", currentQty=" + currentQty +
                ", minLevel=" + minLevel +
                '}';
    }
}