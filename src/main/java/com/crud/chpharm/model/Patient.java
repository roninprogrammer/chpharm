package com.crud.chpharm.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Data
@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private String sampleId;

    @Column(nullable = false)
    private String patientId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String gender;


}
