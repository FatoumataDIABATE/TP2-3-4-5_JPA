package banque;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Table(name = "client")
@Entity
public class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false, length = 10)
    private Integer id;
    @Column(name = "NOM", nullable = false, length = 50)
    private String nom;
    @Column(name = "PRENOM", nullable = false, length = 50)
    private String prenom;
    @Column(name = "DATE_NAISSANCE", nullable = false)
    private LocalDate dateNaissance;

    @ManyToOne
    @JoinColumn(name="BANQUE_ID")
    private Banque banque;

    @ManyToMany
    @JoinTable(name="CLI_CPTE",
            joinColumns= @JoinColumn(name="ID_CLI", referencedColumnName="ID"),
            inverseJoinColumns= @JoinColumn(name="ID_CPTE", referencedColumnName="ID")
    )
    private Set<Compte> comptes;

    @Embedded
    private Adresse adresse;
}





