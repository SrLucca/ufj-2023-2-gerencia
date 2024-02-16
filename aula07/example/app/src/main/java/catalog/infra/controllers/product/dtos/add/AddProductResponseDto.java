package catalog.infra.controllers.product.dtos.add;

public record AddProductResponseDto(
        String id,
        String title,
        String description,
        float price,
        int quantity) {

}
