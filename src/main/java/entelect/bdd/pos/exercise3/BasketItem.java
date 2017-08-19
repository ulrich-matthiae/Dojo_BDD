package entelect.bdd.pos.exercise3;

public class BasketItem {
    private Double cost;
    private Integer quantity;

    public BasketItem(Double cost, Integer quantity) {
        this.cost = cost;
        this.quantity = quantity;
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

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
