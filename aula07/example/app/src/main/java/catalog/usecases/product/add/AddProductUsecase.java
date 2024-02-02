package catalog.usecases.product.add;

import catalog.domain.product.entities.Product;
import catalog.domain.product.gateway.ProductGateway;
import catalog.usecases.Usecase;

public class AddProductUsecase implements Usecase<AddProductInputDto, AddProductOutputDto> {

    private ProductGateway productGateway;

    private AddProductUsecase(ProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    public static AddProductUsecase create(final ProductGateway aGateway) {
        return new AddProductUsecase(aGateway);
    }

    @Override
    public AddProductOutputDto execute(final AddProductInputDto input) {

        final var aProduct = Product.create(
                input.title(),
                input.description(),
                input.price(),
                input.quantity());

        productGateway.save(aProduct);

        return new AddProductOutputDto(
                aProduct.getId(),
                aProduct.getTitle(),
                aProduct.getDescription(),
                aProduct.getPrice(),
                aProduct.getQuantity());

    }

}
