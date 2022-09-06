package com.Cherepovski;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends AbstractId {
    private String FIO;
    private int age;
    private String position;
}
