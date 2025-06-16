package ss10_dsa_danh_sach.quan_ly_phuong_tien.entity;

public class XeTai extends Xe {
    private int trongTai;
    public XeTai() {
    }

    public XeTai(String bienKiemSoat, String tenHangSanXuat, int namSanXuat, String chuSoHuu, int trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public int getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai: " +
                "biển kiểm soát='" + getBienKiemSoat() + '\'' +
                ", tên hãng sản xuất='" + getTenHangSanXuat() + '\'' +
                ", năm sản xuất=" + getNamSanXuat() +
                ", chủ sở hữu='" + getChuSoHuu() + '\'' +
                ", trọng tải=" + trongTai ;
    }
}
