package banque;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Table(name = "banque")
@Entity
public class Banque {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false, length = 10)
    private Integer id;
    @Column(name = "NOM", nullable = false, length = 50)
    private String nom;

    @OneToMany(mappedBy="banque")
    private Set<Client> clients;

    public Banque() {
        clients = new HashSet<Client>();
    }



}
