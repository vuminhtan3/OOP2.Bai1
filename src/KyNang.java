import java.util.SortedMap;

public class KyNang {
    private String tenKyNang;
    private int satThuong;
    private String thuocTinh;
    private String moTa;

    public String getTenKyNang() {
        return tenKyNang;
    }

    public void setTenKyNang(String tenKyNang) {
        this.tenKyNang = tenKyNang;
    }

    public int getSatThuong() {
        return satThuong;
    }

    public void setSatThuong(int satThuong) {
        this.satThuong = satThuong;
    }

    public String getThuocTinh() {
        return thuocTinh;
    }

    public void setThuocTinh(String thuocTinh) {
        this.thuocTinh = thuocTinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void inThongTin() {
        System.out.println("Tên kỹ năng: " + getTenKyNang());
        System.out.println("Sát thương: " + getSatThuong());
        System.out.println("Thuộc tính: " + getThuocTinh());
        System.out.println("Mô Tả: " + getMoTa());
    }
}
