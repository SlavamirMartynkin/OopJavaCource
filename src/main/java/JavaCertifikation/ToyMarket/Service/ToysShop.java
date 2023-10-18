package JavaCertifikation.ToyMarket.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ToysShop {
    private ArrayList<Toy> shopItems;
    private ArrayList<Toy> lotteryLots;
    public Map<Integer, Integer> idMap;

    public ToysShop() {
        this.shopItems = new ArrayList<>();
        this.lotteryLots = new ArrayList<>();
        this.idMap = new HashMap<>();
    }

    public ArrayList<Toy> getShopItems() {
        return shopItems;
    }

    public void setShopItems(ArrayList<Toy> shopItems) {
        this.shopItems = shopItems;
    }

    public ArrayList<Toy> getLotteryLots() {
        return lotteryLots;
    }

    public Map<Integer, Integer> getIdMap() {
        return idMap;
    }

    public void setIdMap(Map<Integer, Integer> idMap) {
        this.idMap = idMap;
    }

    public void setLotteryLots(ArrayList<Toy> lotteryLots) {
        this.lotteryLots = lotteryLots;
    }

    private int createId(Toy toy) {
        int id = toy.getId();
        if (!idMap.containsKey(toy.getId())) {
            idMap.put(id, 0);
        } else {
            while (idMap.containsKey(id)) {
                id++;
            }
            idMap.put(id, 0);
        }
        return id;
    }

    public void addToyToShop(Toy toy) {
        toy.setId(createId(toy));
        shopItems.add(toy);
    }

    public void addToyToLottery(int id, int quantity) {
        Toy selectedToy;
        for (int i = 0; i < shopItems.size(); i++) {
            if (shopItems.get(i).getId() == id) {
                selectedToy = (shopItems.get(i));
                if (shopItems.get(i).getQuantity() == quantity) {
                    shopItems.remove(shopItems.get(i));
                    lotteryLots.add(selectedToy);
                } else {
                    lotteryLots.add(new Toy(
                            shopItems.get(i).getId(),
                            shopItems.get(i).getName(),
                            quantity,
                            shopItems.get(i).getChance()));
                    shopItems.get(i).setQuantity(shopItems.get(i).getQuantity() - quantity);
                }
            }
        }
    }
}
