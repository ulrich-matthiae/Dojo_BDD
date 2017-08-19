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
        int countChocolateBar = 0;
        double costChocolateBar = 0;

        for (BasketItem item : items) {
            Integer quantity = item.getQuantity();

            if (systemDate.getMonthOfYear() == Month.SEPTEMBER.getValue() && item.getItemType().contains("chocolate bar")) {
                countChocolateBar += item.getQuantity();
                costChocolateBar = item.getCost();
            } else {
                total += item.getCost() * quantity;
            }
        }

        total += (countChocolateBar / 2 * costChocolateBar) + (countChocolateBar % 2 * costChocolateBar);

    }

    public void setSystemDate(DateTime systemDate) {
        this.systemDate = systemDate;
    }
}
