package catalog.usecases.product.add;

public record AddProductInputDto(
        String title,
        String description,
        float price,
        int quantity) {

}
