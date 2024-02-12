package catalog.usecases.catalog.list;

import catalog.domain.catalog.entities.Catalog;
import catalog.domain.catalog.entities.Product;
import catalog.domain.gateway.CatalogGateway;
import catalog.usecases.Usecase;

import java.util.List;
import java.util.ArrayList;

public class ListCatalogUsecase implements Usecase<ListCatalogInputDto, ListCatalogOutputDto> {

    private CatalogGateway catalogGateway;

    private ListCatalogUsecase(final CatalogGateway catalogGateway) {
        this.catalogGateway = catalogGateway;
    }

    public static ListCatalogUsecase create(final CatalogGateway aCatalogGateway) {
        return new ListCatalogUsecase(aCatalogGateway);
    }

    @Override
    public ListCatalogOutputDto execute(final ListCatalogInputDto input) {
        final var aCatalogs = this.catalogGateway.list();

        final var aCatalogsDto = this.createOutput(aCatalogs);

        final var anOutput = new ListCatalogOutputDto(aCatalogsDto);

        return anOutput;
    }

    private List<CatalogDto> createOutput(final List<Catalog> catalogs) {

        List<CatalogDto> aCatalogsDto = new ArrayList<CatalogDto>();

        for (Catalog c : catalogs) {
            List<ProductDto> aProductsDto = new ArrayList<ProductDto>();

            for (Product p : c.getProducts()) {
                final var aProductDto = new ProductDto(
                        p.getId(),
                        p.getTitle());
                aProductsDto.add(aProductDto);
            }

            aCatalogsDto.add(new CatalogDto(c.getId(), c.getName(), aProductsDto));
        }

        return aCatalogsDto;
    }

}
