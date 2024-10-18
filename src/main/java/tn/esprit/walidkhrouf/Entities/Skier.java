package tn.esprit.walidkhrouf.Entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idSkier;
    private String name;
    private LocalDate birthDate;
    @OneToOne(mappedBy = "skier")
    Subscription subscription;
    @OneToMany(mappedBy = "skier")
    Set<Registration> registrations;
    @ManyToMany(mappedBy = "Skiers")
    Set <Piste> pistes;
}
