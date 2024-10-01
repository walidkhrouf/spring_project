package tn.esprit.walidkhrouf.Entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numSub;
    private LocalDate startDate;
    private LocalDate endDate;
    private Float price;
    @Enumerated(EnumType.STRING)
    private TypeSubscription typeSub;
    @OneToOne
    skier skier;
}
