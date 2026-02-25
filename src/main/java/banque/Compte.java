package banque;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Table(name = "compte")
@Entity
public class Compte {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false, length = 10)
    private Integer id;
    @Column(name = "NUMERO", nullable = false, length = 50)
    private String numero;
    @Column(name = "SOLDE", nullable = false, length = 50)
    private Double solde;

    @OneToMany(mappedBy="compte")
    private Set<Operation> operations;

    public Compte() {
        operations = new HashSet<Operation>();
    }

}
