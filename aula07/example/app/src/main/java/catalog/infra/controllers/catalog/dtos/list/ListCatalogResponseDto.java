package catalog.infra.controllers.catalog.dtos.list;

import java.util.List;

public record ListCatalogResponseDto (
    List<CatalogDto> catalogs
){
    
}
