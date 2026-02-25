package banque;

import jakarta.persistence.*;


@Embeddable
public class Adresse {
    @Column(name = "NUMERO", nullable = false, length = 50)
    private Integer numero;
    @Column(name = "RUE", nullable = false, length = 50)
    private String rue;
    @Column(name = "CODE_POSTAL", nullable = false, length = 50)
    private Integer codePostal;
    @Column(name = "VILLE", nullable = false, length = 50)
    private String ville;
}
