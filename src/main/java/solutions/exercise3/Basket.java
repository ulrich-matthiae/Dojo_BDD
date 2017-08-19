package solutions.exercise3;

import org.joda.time.DateTime;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<BasketItem> items = new ArrayList();
    private Double total = 0.0;
    private DateTime systemDate;

    public void addItem(Double cost, int quantity, String itemType) {
        items.add(new BasketItem(cost, quantity, itemType));
    }

    public Double getTotal() {
        return total;
    }

    public void calculateTotal() {
        for (BasketItem item : items) {
            total += calculateItemTotal(item);
        }
    }

    private double calculateItemTotal(BasketItem item) {
        Integer quantity = item.getQuantity();

        if (systemDate.getMonthOfYear() == Month.SEPTEMBER.getValue() && item.getItemType().contains("chocolate bar")) {
            quantity = quantity / 2;
        }
        return item.getCost() * quantity;
    }

    public void setSystemDate(DateTime systemDate) {
        this.systemDate = systemDate;
    }
}
