package catalog.infra.controllers.product.dtos.add;

public record AddProductRequestDto(
        String title,
        String description,
        float price,
        int quantity) {

}
