package catalog.utils;

import catalog.domain.product.gateway.ProductGateway;
import catalog.infra.repositories.product.memory.ProductRepositoryMemory;

public class ProductRepositoryUtils {

    private static final ProductGateway productGateway = ProductRepositoryMemory.create();

    public static ProductGateway getProductGateway() {
        return productGateway;
    }
}
