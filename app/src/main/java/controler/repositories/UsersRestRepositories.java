package controler.repositories;

import app.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsersRestRepositories {
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb2",
                    "postgres",
                    "cherep18");
            PreparedStatement ps = con.prepareStatement("select * from users2 t");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String position = rs.getString("position");
                User user = new User(name, age, position);
                users.add(user);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return users;
    }


}
