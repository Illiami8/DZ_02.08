package com.Cherepovski;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Administrator extends AbstractId {
    private String login;
    private String password;
    private String FIO;
    private int age;


}
//Разработать программу с использованием сервлетов и JSP для
// работы с моделью: администратора, тренеров и студентов.
// Все они -- пользователи. Принадлежность к конкретному типу
// -- исключительная.
//Несколько студентов и один тренер объединены в группы.
//Каждая группа имеет уникальный список тем.
//Студент может принадлежать разным группам.
//Тренер разным группам принадлежать не может.
//Администратор, тренер и студент имеют параметры.
//Логин, пароль, ФИО, возраст.
//Тренеры имеют список зарплат.
//Студенты имеют оценку (0-100) по каждой из тем.
//
//Каждый пользователь должен иметь возможность аутентифицироваться.
//Пароли преподавателей и студентов должны храниться в модели.
//Пароль и логин администратора задаются в параметрах веб-приложения
// и инициализируются при загрузке приложения.