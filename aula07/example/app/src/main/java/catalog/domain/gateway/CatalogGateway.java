package catalog.domain.gateway;

import java.util.List;

import catalog.domain.catalog.entities.Catalog;

public interface CatalogGateway {
    
    void save(final Catalog aCatalog);
    List<Catalog> list();

}
