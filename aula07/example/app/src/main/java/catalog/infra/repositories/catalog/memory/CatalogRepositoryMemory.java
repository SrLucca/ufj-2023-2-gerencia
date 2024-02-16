package catalog.infra.repositories.catalog.memory;

import catalog.domain.catalog.entities.Catalog;
import catalog.domain.catalog.gateway.CatalogGateway;

import java.util.HashMap;
import java.util.List;

public class CatalogRepositoryMemory implements CatalogGateway{
    
    private HashMap<String, Catalog> catalogs;

    private CatalogRepositoryMemory() {
        this.catalogs = new HashMap<>();
    }

    public static CatalogRepositoryMemory create() {
        return new CatalogRepositoryMemory();
    }

    @Override
    public void save(final Catalog aCatalog) {
        this.catalogs.put(aCatalog.getId(), aCatalog);
    }

    @Override
    public Catalog find(String anId) {
        return this.catalogs.get(anId);
    }

    @Override
    public List<Catalog> list() {
        return List.copyOf(this.catalogs.values());
    }

}
