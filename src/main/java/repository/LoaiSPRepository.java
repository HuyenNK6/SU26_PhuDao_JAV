package repository;

import entity.LoaiSanPham;
import org.hibernate.Session;
import util.HibernateConfig;

import java.util.List;

public class LoaiSPRepository {
    private Session session;

    public LoaiSPRepository() {
        session= HibernateConfig.getFACTORY().openSession();
    }
    public List <LoaiSanPham> getAll(){
        return session.createQuery("FROM LoaiSanPham").list();
    }

    public static void main(String[] args) {
        System.out.println(new LoaiSPRepository().getAll());
    }
}
