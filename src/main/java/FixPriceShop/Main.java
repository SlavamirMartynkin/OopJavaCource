package FixPriceShop;

public class Main {
    public static void main(String[] args) {
        Category category1 = new Category("Продукты");
        category1.addToCategoryList(new Product("хлеб", 50, 5));
        category1.addToCategoryList(new Product("хлеб", 50, 5));
        category1.addToCategoryList(new Product("молоко", 100, 5));
        category1.addToCategoryList(new Product("молоко", 100, 5));
        category1.addToCategoryList(new Product("мясо", 150, 5));

        Category category2 = new Category("Хозтовары");
        category2.addToCategoryList(new Product("мыло", 100, 5));
        category2.addToCategoryList(new Product("шампунь", 100, 5));
        category2.addToCategoryList(new Product("Моющее средство", 100, 5));

        System.out.println(category1.getCategoryName() + ":");
        System.out.println(category1.getCategoryList());

        System.out.println(category2.getCategoryName() + ":");
        System.out.println(category2.getCategoryList());

        User user1 = new User("first", "1234");
        user1.getBasket().addToBasketList((Product) category1.getCategoryList().get(1));
        user1.getBasket().addToBasketList((Product) category1.getCategoryList().get(2));
        user1.getBasket().addToBasketList((Product) category2.getCategoryList().get(2));
        System.out.println(user1.getLogin() + " купил: ");
        System.out.println(user1.getBasket().getBasketList());

        User user2 = new User("second", "1234");
        user2.getBasket().addToBasketList((Product) category1.getCategoryList().get(0));
        user2.getBasket().addToBasketList((Product) category1.getCategoryList().get(3));
        System.out.println(user2.getLogin() + " купил: ");
        System.out.println(user2.getBasket().getBasketList());

        for (int j = 0; j < category1.getCategoryList().size(); j++) {
            if (user1.getBasket().getBasketList().contains(category1.getCategoryList().get(j))) {
                category1.dellFromCategoryList((Product) category1.getCategoryList().get(j));
                j--;
            }
        }
        for (int j = 0; j < category2.getCategoryList().size(); j++) {
            if (user1.getBasket().getBasketList().contains(category2.getCategoryList().get(j))) {
                category2.dellFromCategoryList((Product) category2.getCategoryList().get(j));
                j--;
            }
        }
        for (int j = 0; j < category1.getCategoryList().size(); j++) {
            if (user2.getBasket().getBasketList().contains(category1.getCategoryList().get(j))) {
                category1.dellFromCategoryList((Product) category1.getCategoryList().get(j));
                j--;
            }
        }
        for (int j = 0; j < category2.getCategoryList().size(); j++) {
            if (user2.getBasket().getBasketList().contains(category2.getCategoryList().get(j))) {
                category2.dellFromCategoryList((Product) category2.getCategoryList().get(j));
                j--;
            }
        }
            System.out.println("В магазине осталось:  ");
            System.out.println(category1.getCategoryName() + ":");
            System.out.println(category1.getCategoryList());
            System.out.println(category2.getCategoryName() + ":");
            System.out.println(category2.getCategoryList());

    }
}