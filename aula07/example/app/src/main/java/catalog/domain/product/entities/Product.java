package catalog.domain.product.entities;

import java.util.UUID;

import catalog.domain.product.policies.StockQuantityPolicy;
import catalog.domain.shared.aggregatte.AggregatteRoot;
import catalog.domain.shared.entities.Entity;
import catalog.domain.shared.exceptions.DomainException;

public class Product extends Entity implements AggregatteRoot {

    private String title;
    private String description;
    private float price;
    private int quantity;

    private Product(String id, String title, String description, float price, int quantity) {
        super(id);
        this.title = title;
        this.description = description;
        this.price = price;
        this.quantity = quantity;

        this.validate();
    }

    public static Product create(String title, String description, float price, int quantity) {
        return new Product(
                UUID.randomUUID().toString(),
                title,
                description,
                price,
                quantity);
    }

    public static Product with(String id, String title, String description, float price, int quantity) {
        return new Product(
                id,
                title,
                description,
                price,
                quantity);
    }

    private void validate(){
        if(this.getId() == null){
            throw new DomainException("Product id is required");
        }

        if(this.title == null || this.title.isEmpty()){
            throw new DomainException("Product title is required");
        }

        if(this.description == null || this.description.isEmpty()){
            throw new DomainException("Product description is required");
        }

        if(this.price <= 0){
            throw new DomainException("Product price is required");
        }

        StockQuantityPolicy.isAccording(this);
    }

    public void increaseStock(int quantity){
        this.quantity += quantity;
    }

    public void sell(int quantity){
        if(this.quantity < quantity){
            throw new DomainException("Insufficient stock");
        }

        this.quantity -= quantity;
    }

    public void changeDescription(String description){
        this.description = description;

        this.validate();
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

}
