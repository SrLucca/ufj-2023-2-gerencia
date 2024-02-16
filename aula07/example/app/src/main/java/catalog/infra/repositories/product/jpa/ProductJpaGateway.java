// package catalog.infra.repositories.product.jpa;

// import catalog.domain.product.entities.Product;
// import catalog.domain.product.gateway.ProductGateway;
// import catalog.infra.repositories.product.jpa.model.ProductJpaModel;

// public class ProductJpaGateway implements ProductGateway{

//     private ProductJpaRepository productJpaRepository;

//     private ProductJpaGateway(ProductJpaRepository productJpaRepository) {
//         this.productJpaRepository = productJpaRepository;
//     }

//     public static ProductJpaGateway create(ProductJpaRepository productJpaRepository) {
//         return new ProductJpaGateway(productJpaRepository);
//     }

//     @Override
//     public void save(Product product) {
//         final var aProductModel = new ProductJpaModel(product);
//         this.productJpaRepository.save(aProductModel);
//     }

//     @Override
//     public Product find(String anId) {
//         final var aProductModel = this.productJpaRepository.findById(anId);
//         final var aProduct = aProductModel.map(ProductJpaModel::toProduct).orElse(null);
//         return aProduct;
//     }
    
// }
