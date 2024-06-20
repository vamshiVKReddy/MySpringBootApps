package learn.bankingApp.Service;

import learn.bankingApp.Model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustService {

    Customer save(Customer customer);

    List<Customer> finAll();

    Customer findById(String id);

    void deleteById(String id);

    Customer update(Customer customer);
}
