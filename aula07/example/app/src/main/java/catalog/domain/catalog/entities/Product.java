package catalog.domain.catalog.entities;

import catalog.domain.shared.entities.Entity;
import catalog.domain.shared.exceptions.DomainException;

public class Product extends Entity{
    
    private String title;

    private Product(String id, String title) {
        super(id);
        this.title = title;
        this.validate();
    }

    public static Product with(String id, String title) {
        return new Product(id, title);
    }

    public String getTitle() {
        return title;
    }

    @Override
    protected void validate() {
        if (this.getId() == null) {
            throw new DomainException("Product id is required");
        }

        if (this.title == null || this.title.isEmpty()) {
            throw new DomainException("Product title is required");
        }
    }

}
