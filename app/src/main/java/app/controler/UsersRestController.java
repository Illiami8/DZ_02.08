package app.controler;

import app.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import app.controler.repositories.UsersRestRepositories;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/api/users")
public class UsersRestController extends HttpServlet {
    // private UsersRepositories usersRepositories = RepositoryFactory.getEmployeeRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UsersRestRepositories usersRestRepositories = new UsersRestRepositories();
        List<User> users = usersRestRepositories.findAll();
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(users);//превращение в строку
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        PrintWriter writer = resp.getWriter();
        writer.print(json);
        writer.flush();
    }
}
