public abstract class MonPhai {
    private String tenMonPhai;
    private String tenTruongMon;
    private KyNang kyNang;
    private String noiO, monQuy, moTa;

    // Getter and Setter
    public String getTenMonPhai() {
        return tenMonPhai;
    }

    public void setTenMonPhai(String tenMonPhai) {
        this.tenMonPhai = tenMonPhai;
    }

    public String getTenTruongMon() {
        return tenTruongMon;
    }

    public void setTenTruongMon(String tenTruongMon) {
        this.tenTruongMon = tenTruongMon;
    }

    public KyNang getKyNang() {
        return kyNang;
    }

    public void setKyNang(KyNang kyNang) {
        this.kyNang = kyNang;
    }

    public String getNoiO() {
        return noiO;
    }

    public void setNoiO(String noiO) {
        this.noiO = noiO;
    }

    public String getMonQuy() {
        return monQuy;
    }

    public void setMonQuy(String monQuy) {
        this.monQuy = monQuy;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void inTTMonPhai() {
        System.out.println("Tên môn phái: " + getTenMonPhai());
        System.out.println("Tên trưởng môn: " + getTenTruongMon());
        System.out.println("Kỹ Năng: ");
        kyNang.inThongTin();
        System.out.println("Nơi ở: " + getNoiO());
        System.out.println("Môn quy: " + getMonQuy());
        System.out.println("Mô tả: " + getMoTa());
    }

    public void soTai(MonPhai o) {
        if (this.kyNang.getSatThuong() == o.kyNang.getSatThuong()) {
            System.out.println(this.tenMonPhai + " và " + o.tenMonPhai + "hoà nhau");
        } else if (this.kyNang.getSatThuong() > o.kyNang.getSatThuong()) {
            System.out.println(this.tenMonPhai + " thắng " + o.tenMonPhai);
        } else {
            System.out.println(o.tenMonPhai + " thắng " + this.tenMonPhai);
        }
    }

    public abstract void luyenCong(String vuKhi, KyNang kyNangLuyen);
    public abstract void anUong(String doAn, String thoiGian, String diaDiem);

}
