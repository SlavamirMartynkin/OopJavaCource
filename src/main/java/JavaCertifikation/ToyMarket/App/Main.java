package JavaCertifikation.ToyMarket.App;

import JavaCertifikation.ToyMarket.Service.Toy;
import JavaCertifikation.ToyMarket.Service.ToysShop;
import JavaCertifikation.ToyMarket.Vieu.Lottery;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<Integer,Integer> idMap = new HashMap<>();
        Toy toy1 = new Toy(1, "car", 100, 50);
        Toy toy2 = new Toy(20, "bus", 200, 20);
        Toy toy3 = new Toy(20, "airbus", 50, 10);
        Toy toy4 = new Toy( 1 ,"constructor", 40, 50);
        Toy toy5 = new Toy( 1, "animal", 100, 40);

        ToysShop shop = new ToysShop();
        shop.addToyToShop(toy1);
        shop.addToyToShop(toy2);
        shop.addToyToShop(toy3);
        shop.addToyToShop(toy4);
        shop.addToyToShop(toy5);

        System.out.println("Перечень товаров: ");
        System.out.println(shop.getShopItems());

        shop.addToyToLottery(1, 2);
        shop.addToyToLottery(20, 2);
        shop.addToyToLottery(3, 2);
        shop.addToyToLottery(21, 2);
        shop.addToyToLottery(2, 2);

        System.out.println("----------------------");
        System.out.println("Перечень товаров (после добавления игрушек в лотерею): ");
        System.out.println(shop.getShopItems());
        System.out.println("----------------------");
        System.out.println("Перечень товаров в лотерее: ");
        System.out.println(shop.getLotteryLots());

        Lottery lottery = new Lottery(new ArrayList<>(),shop.getLotteryLots());
        lottery.startLottery();
        lottery.startLottery();
        lottery.startLottery();

        System.out.println("Призовые игрушки: ");
        System.out.println(lottery.getWinnerToy());

        System.out.println("Осталось в лотерее: ");
        System.out.println(shop.getLotteryLots());
    }
}
