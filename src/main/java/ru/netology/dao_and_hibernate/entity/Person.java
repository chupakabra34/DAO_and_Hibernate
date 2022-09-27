package ru.netology.dao_and_hibernate.entity;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "PERSONS")
public class Person {
    @Id
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private int age;
    @Column
    private String phone_number;
    @Column
    private String city_of_living;
    @javax.persistence.Id
    private Long id;
}