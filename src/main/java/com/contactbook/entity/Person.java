package com.contactbook.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_person")
    private Integer idPerson;

    @Column(name = "name_person", nullable = false, length = 100)
    private String namePerson;

    @Column(name = "email_person", nullable = false, length = 50)
    private String emailPerson;

    @Column(name = "password_person", nullable = false, length = 50, unique = true)
    private String passwordPerson;

}