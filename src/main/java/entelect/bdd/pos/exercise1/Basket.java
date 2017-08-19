package entelect.bdd.pos.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Double> items = new ArrayList();
    private Double total = 0.0;

    public void addItem(Double cost) {
        items.add(cost);
    }

    public Double getTotal() {
        return total;
    }

    public void calculateTotal() {
        for (Double item : items) {
            total += item;
        }
    }
}
