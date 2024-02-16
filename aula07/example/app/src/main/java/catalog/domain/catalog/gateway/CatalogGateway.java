package catalog.domain.gateway;

import catalog.domain.catalog.entities.Catalog;

import java.util.List;

public interface CatalogGateway {
    
    void save(final Catalog aCatalog);
    Catalog find(final String anId);
    List<Catalog> list();

}
