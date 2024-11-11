package tn.esprit.walidkhrouf.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numSub;
    private LocalDate startDate;
    private LocalDate endDate;
    private Float price;
    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSub;
    @OneToOne
    Skier skier;
}
