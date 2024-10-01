package tn.esprit.walidkhrouf.Entities;

import jakarta.persistence.*;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numRegistration;
    private int numWeek;
    @ManyToOne
    skier skier;
    @ManyToOne
    Course course;
}
