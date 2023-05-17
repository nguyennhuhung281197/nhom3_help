package controller;
import model.Khach_hang_Manage;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSerletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Khach_hangServlet", value ="/Khach_hang")
public class Khach_hangServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Khach_hang_Manage khachHangs = new Khach_hang_Manage();
        request.setAttribute("khachHang", khachHangs.getList());
        request.getRequestDispatcher("view/khachhang.jsp").forward(request, response);

    }

}
