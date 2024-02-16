package catalog.usecases.catalog.addcatalogproduct;

import catalog.domain.catalog.entities.Product;
import catalog.domain.catalog.gateway.CatalogGateway;
import catalog.domain.product.gateway.ProductGateway;
import catalog.usecases.Usecase;
import catalog.usecases.exceptions.NotfoundException;

public class AddCatalogProductUsecase implements Usecase<AddCatalogProductInputDto, AddCatalogProductOutputDto> {

    private CatalogGateway catalogGateway;
    private ProductGateway productGateway;

    private AddCatalogProductUsecase(CatalogGateway catalogGateway, ProductGateway productGateway) {
        this.catalogGateway = catalogGateway;
        this.productGateway = productGateway;
    }

    public AddCatalogProductUsecase create(CatalogGateway catalogGateway, ProductGateway productGateway) {
        return new AddCatalogProductUsecase(catalogGateway, productGateway);
    }

    public AddCatalogProductOutputDto execute(AddCatalogProductInputDto input) {
        final var aProduct = this.productGateway.find(input.productId());

        if (aProduct == null) {
            throw new NotfoundException("Product " + input.productId() + " not found while adding to catalog.");
        }

        final var aCatalog = this.catalogGateway.find(input.catalogId());

        if (aCatalog == null) {
            throw new NotfoundException("Catalog " + input.catalogId() + " not found while adding product.");
        }

        final var aCatalogProduct = Product.with(aProduct.getId(), aProduct.getTitle());

        aCatalog.addProduct(aCatalogProduct);

        this.catalogGateway.save(aCatalog);

        final var anOutput = new AddCatalogProductOutputDto(aCatalog.getId(), aCatalogProduct.getTitle());

        return anOutput;
    }
}
