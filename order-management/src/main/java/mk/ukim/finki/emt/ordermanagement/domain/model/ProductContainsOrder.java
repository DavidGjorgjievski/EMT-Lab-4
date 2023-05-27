package mk.ukim.finki.emt.ordermanagement.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ProductContainsOrder implements Serializable {

    @Column(name = "product_id")
    String productId;

    @Column(name = "orderId")
    String orderId;


}
