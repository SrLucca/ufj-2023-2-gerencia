package catalog.infra.repositories.product.memory;

import catalog.domain.product.entities.Product;
import catalog.domain.product.gateway.ProductGateway;

import java.util.HashMap;

public class ProductRepositoryMemory implements ProductGateway{
    
    private HashMap<String, Product> products;

    private ProductRepositoryMemory() {
        this.products = new HashMap<>();
    }

    public static ProductRepositoryMemory create() {
        return new ProductRepositoryMemory();
    }

    @Override
    public void save(final Product product) {
        this.products.put(product.getId(), product);
    }

    @Override
    public Product find(String anId) {
        return this.products.get(anId);
    }

    

}
