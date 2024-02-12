package catalog.domain.catalog.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import catalog.domain.shared.aggregatte.AggregatteRoot;
import catalog.domain.shared.entities.Entity;
import catalog.domain.shared.exceptions.DomainException;

public class Catalog extends Entity implements AggregatteRoot {

    private String name;
    private List<Product> products;

    private Catalog(final String id, final String name, final List<Product> products) {
        super(id);
        this.name = name;
        this.products = products;
        this.validate();
    }

    public static Catalog create(final String aName) {
        return new Catalog(
                UUID.randomUUID().toString(),
                aName,
                new ArrayList<Product>());
    }

    public static Catalog with(final String anId, final String aName, final List<Product> aProducts) {
        return new Catalog(
                anId,
                aName,
                aProducts);
    }

    protected void validate() {
        if (this.getId() == null) {
            throw new DomainException("Catalog id is required");
        }

        if (this.name == null || this.name.isEmpty()) {
            throw new DomainException("Catalog name is required");
        }
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(final Product product) {
        this.products.add(product);
    }

    public void removeProduct(final Product product) {
        this.products.remove(product);
    }

}
