package com.rost.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class Person {
    private int id;

    private String firstName;

    private String lastName;

    private String patronymic;

    private int age;

    private String email;

    @Override
    public String toString() {
        return String.format("%s %s %s, %d; %s", lastName, firstName, patronymic, age, email);
    }
}
