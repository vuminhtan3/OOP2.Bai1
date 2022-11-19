public class VoDang extends MonPhai {

    public void giangDao() {
        System.out.println("Đang đi giảng đạo");
    }
    @Override
    public void luyenCong(String vuKhi, KyNang kyNangLuyen) {
        System.out.println("Đang dùng " + kyNangLuyen + " luyện " + vuKhi);
    }

    @Override
    public void anUong(String doAn, String thoiGian, String diaDiem) {
        System.out.println("Đang ăn " + doAn + " vào buổi " + thoiGian + " tại " + diaDiem);
    }
}
