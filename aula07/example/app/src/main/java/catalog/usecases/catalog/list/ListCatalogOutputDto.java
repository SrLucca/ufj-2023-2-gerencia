package catalog.usecases.catalog.list;

import java.util.List;

public record ListCatalogOutputDto (
    List<CatalogDto> catalogs
) {
    
}
