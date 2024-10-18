package tn.esprit.walidkhrouf.Entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Registration implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numRegistration;
    private int numWeek;
    @ManyToOne
    Skier skier;
    @ManyToOne
    Course course;
}
