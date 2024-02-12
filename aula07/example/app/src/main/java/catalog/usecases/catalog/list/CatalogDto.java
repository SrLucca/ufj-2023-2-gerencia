package catalog.usecases.catalog.list;

import java.util.List;

public record CatalogDto(
    String id,
    String name,
    List<ProductDto> products
) {
    
}
