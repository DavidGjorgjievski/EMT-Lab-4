package mk.ukim.finki.emt.ordermanagement.domain.model;

import lombok.Getter;
import mk.ukim.finki.emt.ordermanagement.domain.valueobjects.Quantity;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;
import mk.ukim.finki.emt.sharedkernel.domain.financial.Money;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="product")
@Getter
public class Product extends AbstractEntity<ProductSerialNumber> {

    private String productName;

    private String manufacturer;

    @AttributeOverrides({
            @AttributeOverride(name="amount", column = @Column(name="price_amount")),
            @AttributeOverride(name="currency", column = @Column(name="price_currency"))
    })
    private Money price;

    private int weight;


    @ManyToMany
    Set<Order> orders = new HashSet<>();

    private Product() {
        super(ProductSerialNumber.randomId(ProductSerialNumber.class));
    }


    public static Product build(String productName, Money price, int weight) {
        Product p = new Product();
        p.price = price;
        p.productName = productName;
        p.weight = weight;
        return p;
    }
}
