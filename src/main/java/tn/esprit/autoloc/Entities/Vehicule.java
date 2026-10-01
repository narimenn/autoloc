package tn.esprit.autoloc.Entities;



import java.util.Formatter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


@Entity
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)// id gere par mysql
    private Long idVehicule;
    String Imatriculation;
    String Marque;
    String Modele;
    @Enumerated(EnumType.STRING)
    CategorieVehicule categorie;
    StatutVehicule status;


    @Override
    public String toString() {
        return super.toString();
    }
}


