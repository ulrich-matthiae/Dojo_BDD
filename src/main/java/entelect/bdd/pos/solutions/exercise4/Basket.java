package entelect.bdd.pos.solutions.exercise4;

import org.joda.time.DateTime;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<BasketItem> items = new ArrayList();
    private Double total = 0.0;
    private DateTime systemDate;

    public void addItem(Double cost, Double quantity, String itemType) {
        items.add(new BasketItem(cost, quantity, itemType));
    }

    public Double getTotal() {
        return total;
    }

    public void calculateTotal() {
        int countChocolateBar = 0;
        double costChocolateBar = 0;

        for (BasketItem item : items) {
            Double quantity = item.getQuantity();

            if (systemDate != null && systemDate.getMonthOfYear() == Month.SEPTEMBER.getValue() && item.getItemType().contains("chocolate bar")) {
                countChocolateBar += item.getQuantity();
                costChocolateBar = item.getCost();
            } else {
                total += item.getCost() * quantity;
            }
        }

        total += (countChocolateBar / 2 * costChocolateBar) + (countChocolateBar % 2 * costChocolateBar);
        roundTotal();
    }

    private void roundTotal() {
        total = (double) Math.round(total * 100) / 100;
    }

    public void setSystemDate(DateTime systemDate) {
        this.systemDate = systemDate;
    }
}
