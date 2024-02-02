package catalog.domain.product.policies;

import catalog.domain.product.entities.Product;
import catalog.domain.shared.exceptions.DomainException;
import catalog.domain.shared.policies.Policy;

public class StockQuantityPolicy implements Policy<Product>{

    public static void isAccording(Product entity){
        new StockQuantityPolicy().validate(entity);
    }

    @Override
    public void validate(Product entity) {
        if(entity.getQuantity() < 0){
            throw new DomainException("Product quantity is required");
        }
    }
    
}
