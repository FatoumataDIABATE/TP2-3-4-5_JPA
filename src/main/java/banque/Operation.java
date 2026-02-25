package banque;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Table(name = "operation")
@Entity
public class Operation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false, length = 10)
    private Integer id;
    @Column(name = "DATE", nullable = false)
    private LocalDateTime date;
    @Column(name = "MONTANT", nullable = false, length = 50)
    private Double montant;
    @Column
    private String motif;

    @ManyToOne
    @JoinColumn(name="COMPTE_ID")
    private Compte compte;
}
