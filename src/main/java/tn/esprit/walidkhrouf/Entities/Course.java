package tn.esprit.walidkhrouf.Entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  numCourse;
    private int  level;
    @Enumerated(EnumType.STRING)
    private TypeCourse   typeCourse;
    @Enumerated(EnumType.STRING)
    private Support   support;
    private int  price;
    private int   timeslot;
    @OneToMany(mappedBy = "course")
    Set <Registration> registrations;



}
