package catalog.domain.gateway;

import catalog.domain.catalog.entities.Catalog;

public interface CatalogGateway {
    
    void save(final Catalog aCatalog);
    Catalog find(final String anId);

}
