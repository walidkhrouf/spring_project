package tn.esprit.walidkhrouf.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class skier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSkier;
    private String name;
    private LocalDate birthDate;
    @OneToOne(mappedBy = "skier")
    Subscription subscription;
    @OneToMany(mappedBy = "skier")
    Set<Registration> registrations;
    @ManyToMany(mappedBy = "skiers")
    Set <Piste> pistes;
}
