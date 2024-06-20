package learn.bankingApp.Controller;

import learn.bankingApp.Model.Customer;
import learn.bankingApp.Service.CustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustController {

    @Autowired
    private CustService custService;

    @PostMapping("/customer/save")
    public ResponseEntity<Customer> save(@RequestBody Customer customer){
        return ResponseEntity.ok(custService.save(customer));
    }

    @GetMapping("/customer/findById/{id}")
    public ResponseEntity<Customer> findById(@PathVariable String id){
        return ResponseEntity.ok(custService.findById(id));
    }

    @DeleteMapping("/customer/deleteById/{id}")
    public ResponseEntity<String> deleteById(@PathVariable String id){
         custService.deleteById(id);
         return ResponseEntity.ok("Deleted Successfully");
    }

    @PutMapping("/customer/update")
    public ResponseEntity<Customer> update(@RequestBody Customer customer){
        return ResponseEntity.ok(custService.update(customer));
    }

    @GetMapping("/customer/findAll")
    public ResponseEntity<List<Customer>> findAll(){
        return ResponseEntity.ok(custService.finAll());
    }

}
