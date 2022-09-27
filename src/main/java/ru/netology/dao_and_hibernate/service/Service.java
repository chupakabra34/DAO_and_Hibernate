package ru.netology.dao_and_hibernate.service;

import ru.netology.dao_and_hibernate.entity.Person;
import ru.netology.dao_and_hibernate.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}