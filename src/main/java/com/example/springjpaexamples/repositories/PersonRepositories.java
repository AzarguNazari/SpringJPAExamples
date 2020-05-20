package com.example.springjpaexamples.repositories;

import com.example.springjpaexamples.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PersonRepositories extends JpaRepository<Person, Integer> {
    List<Person> findByFirstName(String firstname);
    List<Person> findByFirstNameAndLastName(String firstname, String lastname);
    List<Person> findByFirstNameOrLastName(String firstName, String lastname);
    List<Person> findByLastName(String lastName);
    List<Person> findByAge(int age);
    List<Person> findByEmail(String firstname);
    List<Person> findByAgeLessThan(int age);
    List<Person> findByAgeGreaterThan(int age);
    List<Person> findByAgeGreaterThanEqual(int age);
    List<Person> findByDateOfBirthAfter(LocalDate afterDate);
    List<Person> findByDateOfBirthBefore(LocalDate afterDate);
    List<Person> findByActiveTrue();
}
