package catalog.usecases.product.add;

public record AddProductOutputDto(
        String id,
        String title,
        String description,
        float price,
        int quantity) {

}
