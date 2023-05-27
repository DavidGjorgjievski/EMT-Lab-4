package mk.ukim.finki.emt.ordermanagement.domain.model;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;
import org.springframework.lang.NonNull;

public class ProductSerialNumber extends DomainObjectId {

    private ProductSerialNumber() {
        super(ProductSerialNumber.randomId(ProductSerialNumber.class).getId());
    }

    public ProductSerialNumber(@NonNull String uuid) {
        super(uuid);
    }

    public static ProductSerialNumber of(String uuid) {
        ProductSerialNumber p = new ProductSerialNumber(uuid);
        return p;
    }

}
