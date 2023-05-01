package hac.repo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Entity
public class Purchase implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "Name is mandatory")
    private String userName;

    // default value 0
    private Integer price = 0;

    public Purchase(String userName, Integer total) {
        this.userName = userName;
        this.price = total;
    }

    public Purchase() {

    }
}
