package tn.esprit.walidkhrouf.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  numInstructor;
    private  String firstName;
    private  String  lastName;
    private LocalDate dateOfHire;
    @OneToMany
    Set <Course> courses;
}
