package Cookies;

import java.util.ArrayList;
import java.util.List;

public class MasterOrder {

    List<Cookies.CookieOrder> orders = new ArrayList<>();

    public void addOrder(Cookies.CookieOrder cookieOrder) {
        orders.add(cookieOrder);

    }

    public int getTotalBoxes() {
        int boxes = 0;
        for (Cookies.CookieOrder order : orders) {
            boxes += order.getNumBoxes();

        }
        return boxes;
    }

    public void removeVariety(String variety) {
        for (int i = orders.size() - 1; i >= 0; i--) {
            if (orders.get(i).getVariety().equals(variety)) {
                orders.remove(i);

            }
        }

    }

    public int getVarietyBoxes(String variety) {
        int countVarietyBoxes = 0;
        for (Cookies.CookieOrder order : orders) {
            if (order.getVariety().equals(variety)) {
                countVarietyBoxes += order.getNumBoxes();

            }
        }
        return countVarietyBoxes;
    }

    public void showOrder(){
        for(Cookies.CookieOrder order: orders){
            System.out.println("Variety: " + order.getVariety() + " Boxes: " + order.getNumBoxes());
        }
    }
}






