public class CaiBang extends MonPhai {
    public void anXin() {
        System.out.println("Đi ăn mày");
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
