package learn.bankingApp.Service;

import learn.bankingApp.Model.Customer;
import learn.bankingApp.Repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CustServiceImp implements CustService{

    @Autowired
    private CustomerRepo  customerRepo;


    @Override
    public Customer save(Customer customer) {
        customer.setId(UUID.randomUUID().toString());
        return customerRepo.save(customer);
    }

    @Override
    public List<Customer> finAll() {
        return customerRepo.findAll();
    }

    @Override
    public Customer findById(String id) {
        return customerRepo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(String id) {

        customerRepo.deleteById(id);
    }

    @Override
    public Customer update(Customer customer) {
        if(customerRepo.findById(customer.getId()).isPresent()){
            return customerRepo.save(customer);
        }
        return null;
    }
}
