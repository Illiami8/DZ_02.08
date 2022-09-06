package controler.repositories;

import com.Cherepovski.User;

import java.util.List;

public class UsersRepositories {
    public List<User> findAll(){
        return List.of(new User("Ivan Cosocski",20,"Administrator"),
                new User("Max Zelenov",27,"Student"));

    }
}
