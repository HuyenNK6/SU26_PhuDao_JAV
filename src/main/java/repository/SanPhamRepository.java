package repository;

import entity.SanPham;
import org.hibernate.Session;
import util.HibernateConfig;

import java.util.List;

public class SanPhamRepository {
    private Session session;

    public SanPhamRepository() {
        session = HibernateConfig.getFACTORY().openSession();//mở phiên làm việc của session
    }
    /*
    HQL- Hibernate Query Languague: ngôn ngữ truy vấn của Hibernate dùng đề làm việc với dữ liệu
    thông qua class Java (Entity) thay vì thao tác trực tiếp với bảng trong DB
     */
    public List<SanPham> getAll(){
        return session.createQuery("FROM SanPham").list();
    }

    public static void main(String[] args) {
        System.out.println(new SanPhamRepository().getAll());
    }
}
