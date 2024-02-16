package catalog.infra.controllers.catalog.dtos.list;

import java.util.List;

public record CatalogDto(
    String id,
    String name,
    List<ProductDto> products
) {
    
}
