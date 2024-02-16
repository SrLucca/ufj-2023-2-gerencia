package catalog.usecases.product.find;

import catalog.domain.product.gateway.ProductGateway;
import catalog.usecases.Usecase;
import catalog.usecases.exceptions.NotfoundException;

public class FindProductUsecase implements Usecase<FindProductInputDto, FindProductOutputDto> {

    private ProductGateway productGateway;

    private FindProductUsecase(ProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    public static FindProductUsecase create(final ProductGateway aGateway) {
        return new FindProductUsecase(aGateway);
    }

    @Override
    public FindProductOutputDto execute(FindProductInputDto input) {
        var aProduct = productGateway.find(input.id());

        if(aProduct == null) {
            throw new NotfoundException("Product not found");
        }

        return new FindProductOutputDto(
                aProduct.getId(),
                aProduct.getTitle(),
                aProduct.getDescription(),
                aProduct.getPrice(),
                aProduct.getQuantity());
    }

}
