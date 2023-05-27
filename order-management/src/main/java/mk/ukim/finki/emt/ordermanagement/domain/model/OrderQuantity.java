package mk.ukim.finki.emt.ordermanagement.domain.model;

import mk.ukim.finki.emt.ordermanagement.domain.valueobjects.Quantity;

import javax.persistence.*;

@Entity
public class OrderQuantity {

    @EmbeddedId
    ProductContainsOrder id;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "student_id")
    Product product;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "order_id")
    Order order;

    Quantity quantity;
}
