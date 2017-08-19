package entelect.bdd.pos.solutions.exercise4;

public class BasketItem {
    private final String itemType;
    private Double cost;
    private Double quantity;

    public BasketItem(Double cost, Double quantity, String itemType) {
        this.cost = cost;
        this.quantity = quantity;
        this.itemType = itemType;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getQuantity() {
        return quantity;
    }

    public String getItemType() {
        return itemType;
    }
}
