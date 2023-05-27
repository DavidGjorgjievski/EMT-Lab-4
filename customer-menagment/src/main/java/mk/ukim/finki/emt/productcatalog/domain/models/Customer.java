package mk.ukim.finki.emt.productcatalog.domain.models;

import lombok.Getter;
import mk.ukim.finki.emt.sharedkernel.domain.base.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
@Getter
public class Customer extends AbstractEntity<CustomerId> {

    private String customerName;

    private String customerSurname;

    private String email;

    private String password;

    public static Customer build(String customerName,String customerSurname,String email,String password){
        Customer c = new Customer();
        c.customerName = customerName;
        c.customerSurname = customerSurname;
        c.email = email;
        c.password = password;
    }


}
