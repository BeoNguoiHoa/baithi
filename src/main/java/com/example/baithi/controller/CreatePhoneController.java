package com.example.baithi.controller;

import com.example.baithi.entity.Phone;
import com.example.baithi.model.PhoneModel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreatePhoneController extends HttpServlet {

    private PhoneModel phoneModel = new PhoneModel();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/phone/addphones.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String name = req.getParameter("name");
            String brand = req.getParameter("brand");
            double price = Double.parseDouble(req.getParameter("price"));
            String description = req.getParameter("description");
            Phone p = new Phone(name, brand, price, description);
            if (phoneModel.save(p)){
                resp.getWriter().println("Thanh Cong");
                //resp.sendRedirect("/admin/game/list");
            }
            resp.getWriter().println("Thanh Cong");
        }catch (Exception ex) {
            resp.getWriter().println("Error");
        }
    }
}
