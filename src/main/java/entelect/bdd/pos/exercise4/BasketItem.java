package entelect.bdd.pos.exercise4;

public class BasketItem {
    private final String itemType;
    private Double cost;
    private Integer quantity;

    public BasketItem(Double cost, Integer quantity, String itemType) {
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

    public Integer getQuantity() {
        return quantity;
    }

    public String getItemType() {
        return itemType;
    }
}
