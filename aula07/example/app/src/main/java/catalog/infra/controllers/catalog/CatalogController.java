package catalog.infra.controllers.catalog;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import catalog.domain.catalog.gateway.CatalogGateway;
import catalog.domain.product.gateway.ProductGateway;
import catalog.infra.controllers.catalog.dtos.add.AddCatalogRequestDto;
import catalog.infra.controllers.catalog.dtos.add.AddCatalogResponseDto;
import catalog.infra.controllers.catalog.dtos.list.CatalogDto;
import catalog.infra.controllers.catalog.dtos.list.ListCatalogResponseDto;
import catalog.infra.controllers.catalog.dtos.list.ProductDto;
import catalog.infra.repositories.catalog.memory.CatalogRepositoryMemory;
import catalog.usecases.catalog.add.AddCatalogInputDto;
import catalog.usecases.catalog.add.AddCatalogUsecase;
import catalog.usecases.catalog.list.ListCatalogInputDto;
import catalog.usecases.catalog.list.ListCatalogUsecase;
import catalog.utils.ProductRepositoryUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/catalogs")
public class CatalogController {

    private CatalogGateway catalogGateway;
    private ProductGateway productGateway;

    public CatalogController() {
        super();
        this.catalogGateway = CatalogRepositoryMemory.create();
        this.productGateway = ProductRepositoryUtils.getProductGateway();
    }

    @PostMapping("/add")
    public AddCatalogResponseDto addCatalog(@RequestBody AddCatalogRequestDto request) {
        final var anInput = new AddCatalogInputDto(
                request.name());

        final var aResult = AddCatalogUsecase.create(catalogGateway).execute(anInput);

        final var aResponse = new AddCatalogResponseDto(
                aResult.id(),
                aResult.name());

        return aResponse;
    }

    @GetMapping("/list")
    public ListCatalogResponseDto listCatalogs() {

        final var anInput = new ListCatalogInputDto();

        final var aResult = ListCatalogUsecase.create(catalogGateway).execute(anInput);

        final List<CatalogDto> aCatalogs = new ArrayList<>();

        aResult.catalogs().forEach(catalog -> {
            final var aProducts = new ArrayList<ProductDto>();
            catalog.products().forEach(product -> {
                final var aProductDto = new ProductDto(
                        product.id(),
                        product.title());

                aProducts.add(aProductDto);
            });

            final var aCatalogDto = new CatalogDto(
                    catalog.id(),
                    catalog.name(),
                    aProducts);

            aCatalogs.add(aCatalogDto);
        });

        final var aResponse = new ListCatalogResponseDto(aCatalogs);

        return aResponse;
    }

    // @PostMapping("path")
    // public AddProductToCatalogResponseDto addProductToCatalog(@RequestBody AddProductToCatalogRequestDto request) {
        
    // }
    

}
