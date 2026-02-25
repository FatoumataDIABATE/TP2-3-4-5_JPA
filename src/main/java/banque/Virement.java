package banque;

import jakarta.persistence.*;


@Entity
@DiscriminatorValue("V")
public class Virement extends Operation{
    @Column(name = "BENEFICIAIRE", nullable = false, length = 50)
    private String beneficiaire;
}
