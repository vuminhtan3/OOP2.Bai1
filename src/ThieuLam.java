public class ThieuLam extends MonPhai {

    public void tungKinh() {
        System.out.println("Đang tụng kinh");
    }
    @Override
    public void luyenCong(String vuKhi, KyNang kyNangLuyen) {
        System.out.println("Đang dùng " + kyNangLuyen.getTenKyNang() + " luyện " + vuKhi);
    }

    @Override
    public void anUong(String doAn, String thoiGian, String diaDiem) {
        System.out.println("Đang ăn " + doAn + " vào buổi " + thoiGian + " tại " + diaDiem);
    }
}
