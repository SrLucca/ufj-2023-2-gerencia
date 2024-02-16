package catalog.infra.controllers.product.dtos.find;

public record FindProductResponseDto(
        String id,
        String title,
        String description,
        float price,
        int quantity) {

}
