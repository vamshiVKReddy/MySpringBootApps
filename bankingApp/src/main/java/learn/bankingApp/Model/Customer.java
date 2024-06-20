package learn.bankingApp.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Setter
@Getter
public class Customer {

    @Id
    private String id;

    private String name;

    private Long acnumber;

    private String address;
}
