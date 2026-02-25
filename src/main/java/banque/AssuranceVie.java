package banque;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("A")
public class AssuranceVie extends Compte {
    @Column(name = "TAUX", nullable = false, length = 50)
    private Double taux;
    @Column(name = "DATE_FIN", nullable = false)
    private LocalDateTime DateFin;

}
