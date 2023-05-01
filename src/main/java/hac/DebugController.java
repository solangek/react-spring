package hac;

import hac.repo.Purchase;
import hac.repo.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Do not edit this code, it is for debugging purposes only.
 * You can check the DB contents by visiting http://localhost:8080/debug/purchases
 */
@RestController
@RequestMapping("/debug")
public class DebugController {
    @Autowired
    private PurchaseRepository repository;

    @GetMapping("/purchases")
    public List<Purchase> showPurchases() {
        return repository.findAll();
    }
}
