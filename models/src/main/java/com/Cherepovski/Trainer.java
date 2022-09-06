package com.Cherepovski;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trainer extends AbstractId {
    private String login;
    private String password;
    private String FIO;
    private int age;
    private int salary;
}
