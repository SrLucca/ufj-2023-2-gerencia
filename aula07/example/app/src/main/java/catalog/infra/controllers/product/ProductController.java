package catalog.infra.controllers.product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import catalog.domain.product.gateway.ProductGateway;
import catalog.infra.controllers.product.dtos.add.AddProductRequestDto;
import catalog.infra.controllers.product.dtos.add.AddProductResponseDto;
import catalog.infra.controllers.product.dtos.find.FindProductResponseDto;
import catalog.usecases.product.add.AddProductInputDto;
import catalog.usecases.product.add.AddProductUsecase;
import catalog.usecases.product.find.FindProductInputDto;
import catalog.usecases.product.find.FindProductUsecase;
import catalog.utils.ProductRepositoryUtils;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/products")
public class ProductController {
    
    private ProductGateway productGateway;

    // @Autowired
    // private ProductJpaRepository productJpaRepository;

    public ProductController() {
        super();
        this.productGateway = ProductRepositoryUtils.getProductGateway();
    }

    @PostMapping("/add")
    public AddProductResponseDto add(@RequestBody AddProductRequestDto aRequest) {
        final var input = new AddProductInputDto(
            aRequest.title(),
            aRequest.description(),
            aRequest.price(),
            aRequest.quantity()
        );

        // final var aGateway = ProductJpaGateway.create(productJpaRepository);

        final var aResult = AddProductUsecase.create(productGateway).execute(input);

        final var aResponse = new AddProductResponseDto(
            aResult.id(),
            aResult.title(),
            aResult.description(),
            aResult.price(),
            aResult.quantity()
        );

        return aResponse;
    }

    @GetMapping("/{id}")
    public FindProductResponseDto find(@PathVariable String id) {
        final var anInput = new FindProductInputDto(id);

        // final var aGateway = ProductJpaGateway.create(productJpaRepository);

        final var aResult = FindProductUsecase.create(productGateway).execute(anInput);

        final var aResponse = new FindProductResponseDto(
            aResult.id(),
            aResult.title(),
            aResult.description(),
            aResult.price(),
            aResult.quantity()
        );

        return aResponse;
    }
    
}
