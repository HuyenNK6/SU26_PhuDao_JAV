package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.SanPhamRepository;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "sanPhamServlet", value = {
        "/san-pham/hien-thi", //GET
        "/san-pham/add",//POST
        "/san-pham/update",//POST
        "/san-pham/detail",//GET
        "/san-pham/delete" //GET
})
public class SanPhamServlet extends HttpServlet {
    SanPhamRepository sanPhamRepo= new SanPhamRepository();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri= req.getRequestURI();
        if(uri.contains("hien-thi")){
            this.hienThi(req,resp);
        }else if(uri.contains("detail")){
            this.detail(req,resp);
        }else if(uri.contains("delete")){
            this.delete(req,resp);
        }
    }
    private void hienThi(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. lấy toàn bộ danhh sách Sp từ bên repo
        List listSP= sanPhamRepo.getAll();
        //2. set thuộc tính
        req.setAttribute("listSP", listSP);
        //3. gửi sang JSP
        req.getRequestDispatcher("/san-pham/hien-thi.jsp").forward(req,resp);
    }
    private void delete(HttpServletRequest req, HttpServletResponse resp) {
    }

    private void detail(HttpServletRequest req, HttpServletResponse resp) {
    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }
}
