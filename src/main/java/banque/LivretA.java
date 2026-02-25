package banque;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("L")
public class LivretA extends Compte {
    private Integer id;
    @Column(name = "TAUX", nullable = false, length = 50)
    private Double taux;

}
