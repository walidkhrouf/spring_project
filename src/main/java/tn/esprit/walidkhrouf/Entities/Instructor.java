package tn.esprit.walidkhrouf.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Instructor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  numInstructor;
    private  String firstName;
    private  String  lastName;
    private LocalDate dateOfHire;
    @OneToMany
    Set <Course> courses;
}
