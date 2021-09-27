package Web.Servlet;

import Bean.User;
import Service.UserService;
import Service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

/**
 * @WebServlet(name = "userlistservlet", value = "/userlistservlet")
 */
@WebServlet("/userlistservlet")
public class UserListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //调用userservice()方法，完成查询
        UserService userService = new UserServiceImpl();
        List<User> users = userService.findAll();
        //将list存入到request域中
        request.setAttribute("users",users);
        //转发到页面
        request.getRequestDispatcher("forever_a_LiseSelectCase_war_exploded/list.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
