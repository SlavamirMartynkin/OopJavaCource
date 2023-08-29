package FixPriceShop;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public String getLogin() {
        return login;
    }

    public Basket getBasket() {
        return basket;
    }

    public User(String login, String password){
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }


}
