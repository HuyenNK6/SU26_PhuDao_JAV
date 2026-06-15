package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity//đánh dấu class này là 1 bảng trong database
@Table(name = "san_pham")// MAP Java class SanPham với bảng "san_pham" trong DB
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "ma")
    private String ma;
    @Column(name = "ten")
    private String ten;
    @Column(name = "mota")
    private String moTa;
//    @Column(name = "id_loai_sp")
//    private Integer idLoaiSP;
    //MAPPING mối quan hệ chuẩn ORM (Object Relation Mapping)
    @ManyToOne//quan hệ: Nhiều SP - 1 loại SP
    @JoinColumn(name = "id_loai_sp", referencedColumnName = "id")
    //Cột khóa ngoại "id_loai_sp" trong bảng SP -> tham chiếu tới cột "id" trong bảng LoaiSanPham
    private LoaiSanPham loaiSP;
}
