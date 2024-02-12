package catalog.usecases.catalog.addcatalogproduct;

public record AddCatalogProductInputDto(
        String catalogId,
        String productId,
        String productTitle) {

}
