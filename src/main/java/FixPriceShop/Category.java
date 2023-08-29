package FixPriceShop;

import java.util.ArrayList;

public class Category {
    private String categoryName;
    private ArrayList categoryList;

    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.categoryList = new ArrayList<>();
    }

    public String getCategoryName() {
        return categoryName;
    }

    public ArrayList getCategoryList() {
        return categoryList;
    }

    public void addToCategoryList(Product product) {
        categoryList.add(product);
    }

    public void dellFromCategoryList(Product product) {
        categoryList.remove(product);
    }

}
