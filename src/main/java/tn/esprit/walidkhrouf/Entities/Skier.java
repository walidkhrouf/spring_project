package tn.esprit.walidkhrouf.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long numSkier;
    private String name;
    private String lastname;
    private LocalDate birthDate;
    @OneToOne(mappedBy = "skier", cascade = CascadeType.ALL)
    private Subscription subscription;
    @OneToMany(mappedBy = "skier")
    Set<Registration> registrations;
    @ManyToMany(mappedBy = "Skiers")
    Set <Piste> pistes;
}
