package catalog.domain.product.gateway;

import catalog.domain.product.entities.Product;

public interface ProductGateway {
    void save(Product product);
    Product findById(String anId);
}
