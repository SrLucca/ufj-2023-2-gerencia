package catalog.domain.catalog.entities;

import catalog.domain.shared.entities.Entity;

public class Product extends Entity{
    
    private String title;

    private Product(String id, String title) {
        super(id);
        this.title = title;
    }

    public static Product with(String id, String title) {
        return new Product(id, title);
    }

    public String getTitle() {
        return title;
    }

}
