package catalog.usecases.catalog.add;

import catalog.domain.catalog.entities.Catalog;
import catalog.domain.gateway.CatalogGateway;
import catalog.usecases.Usecase;

public class AddCatalogUsecase implements Usecase<AddCatalogInputDto, AddCatalogOutputDto> {

    private CatalogGateway catalogGateway;

    private AddCatalogUsecase(final CatalogGateway catalogGateway) {
        this.catalogGateway = catalogGateway;
    }

    public static AddCatalogUsecase create(final CatalogGateway aGateway) {
        return new AddCatalogUsecase(aGateway);
    }

    @Override
    public AddCatalogOutputDto execute(final AddCatalogInputDto input) {

        // Cria de acordo com as regras de domínio
        final var aCatalog = Catalog.create(input.name());

        // Persiste no banco de dados utilizando o gateway
        this.catalogGateway.save(aCatalog);

        // Retorna o resultado

        final var aCatalogId = aCatalog.getId();
        final var aCatalogName = aCatalog.getName();

        final var aResult = new AddCatalogOutputDto(
                aCatalogId,
                aCatalogName);

        return aResult;

    }

}
