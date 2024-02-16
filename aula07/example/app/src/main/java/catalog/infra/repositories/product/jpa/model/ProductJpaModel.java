// package catalog.infra.repositories.product.jpa.model;

// import catalog.domain.product.entities.Product;
// import jakarta.persistence.Column;
// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.Table;

// @Entity(name = "product")
// @Table(name = "products")
// public class ProductJpaModel {
    
//     @Id
//     private String id;
//     @Column(name = "title")
//     private String title;
//     @Column(name = "description")
//     private String description;
//     @Column(name = "price")
//     private float price;
//     @Column(name = "quantity")
//     private int quantity;

//     public ProductJpaModel() {
//     }

//     public ProductJpaModel(Product product) {
//         this.id = product.getId();
//         this.title = product.getTitle();
//         this.description = product.getDescription();
//         this.price = product.getPrice();
//         this.quantity = product.getQuantity();
//     }

//     public Product toProduct() {
//         return Product.with(id, title, description, price, quantity);
//     }

//     /**
//      * @return the id
//      */
//     public String getId() {
//         return id;
//     }

//     /**
//      * @param id the id to set
//      */
//     public void setId(String id) {
//         this.id = id;
//     }

//     /**
//      * @return the title
//      */
//     public String getTitle() {
//         return title;
//     }

//     /**
//      * @param title the title to set
//      */
//     public void setTitle(String title) {
//         this.title = title;
//     }

//     /**
//      * @return the description
//      */
//     public String getDescription() {
//         return description;
//     }

//     /**
//      * @param description the description to set
//      */
//     public void setDescription(String description) {
//         this.description = description;
//     }

//     /**
//      * @return the price
//      */
//     public float getPrice() {
//         return price;
//     }

//     /**
//      * @param price the price to set
//      */
//     public void setPrice(float price) {
//         this.price = price;
//     }

//     /**
//      * @return the quantity
//      */
//     public int getQuantity() {
//         return quantity;
//     }

//     /**
//      * @param quantity the quantity to set
//      */
//     public void setQuantity(int quantity) {
//         this.quantity = quantity;
//     }

    

// }
