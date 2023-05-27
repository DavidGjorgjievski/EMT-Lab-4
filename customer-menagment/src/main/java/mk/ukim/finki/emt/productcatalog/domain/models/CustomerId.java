package mk.ukim.finki.emt.productcatalog.domain.models;

import mk.ukim.finki.emt.sharedkernel.domain.base.DomainObjectId;

public class CustomerId extends DomainObjectId {


    private CustomerId() {
        super(CustomerId.randomId(CustomerId.class).getId());
    }

    protected CustomerId(String uuid) {
        super(uuid);
    }

    public static CustomerId of(String uuid) {
        CustomerId p = new CustomerId(uuid);
        return p;
    }
}
