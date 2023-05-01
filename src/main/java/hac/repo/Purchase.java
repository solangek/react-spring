package hac.repo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * a purchase is a record of a user buying a product. You should not need to edit this file
 * but if you feel like you need to, please get in touch with the teacher.
 */
@Entity
public class Purchase implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty(message = "Name is mandatory")
    private String email;

    // default value 0
    private Double payment = 0.0;

    public Purchase(String email, Double total) {
        this.email = email;
        this.payment = total;
    }

    public Purchase() {

    }
}
