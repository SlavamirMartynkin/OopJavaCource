package FixPriceShop;

import java.util.ArrayList;

public class Basket {
    private ArrayList basketList;

    public Basket(){
        this.basketList = new ArrayList();
    }

    public ArrayList getBasketList() {
        return basketList;
    }

    public void addToBasketList(Product product) {
        basketList.add(product);
    }
    public void dellFromBasketList(Product product) {
        basketList.remove(product);
    }
}
