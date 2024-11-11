package tn.esprit.walidkhrouf.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numPiste;
    private String namePiste;
    @Enumerated(EnumType.STRING)
    private Color color;

    private int length;
    private int slope;
    @ManyToMany
    Set <Skier> Skiers;
}
