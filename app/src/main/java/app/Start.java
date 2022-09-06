package app;

import java.sql.*;

public class Start {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb2",
                    "mybd_owener2",
                    "illia18");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users2 t ");

            while (resultSet.next()){
                User user = new User();
                user.setAge(resultSet.getInt("age"));
                user.setName(resultSet.getString("name"));
                user.setPosition(resultSet.getString("position"));

                System.out.println(user);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
