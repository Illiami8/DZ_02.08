package app.controler;

import app.controler.repositories.UsersRepositories;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users")
public class UsersControler extends HttpServlet {

private UsersRepositories usersRepositories = new UsersRepositories();
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("users", usersRepositories.findAll());//азвание атрибута , который мы передаем через реквест
        req.getRequestDispatcher("users.jsp").forward(req,resp);// сначала попадаем на html ,
        // делаем переход сюда, а отсюда передаем на jsp

    }


}
