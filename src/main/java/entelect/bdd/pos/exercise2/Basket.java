package entelect.bdd.pos.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<BasketItem> items = new ArrayList();
    private Double total = 0.0;

    public void addItem(Double cost) {
        addItem(cost, 1);
    }

    public void addItem(Double cost, int quantity) {
        items.add(new BasketItem(cost, quantity));
    }

    public Double getTotal() {
        return total;
    }

    public void calculateTotal() {
        for (BasketItem item : items) {
            total += (item.getCost() * item.getQuantity());
        }

    }
}
