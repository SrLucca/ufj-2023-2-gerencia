package catalog.domain.gateway;

import java.util.List;

import catalog.domain.catalog.entities.Product;

public interface ProductGateway {
    void save(Product product);
    List<Product> listByCatalog(final String catalogId);
}
