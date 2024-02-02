package catalog.usecases.product.find;

public record FindProductOutputDto(
        String id,
        String title,
        String description,
        float price,
        int quantity) {

}
