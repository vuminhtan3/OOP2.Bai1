public class Main {
    public static void main(String[] args) {
        KyNang noiCong = new NoiCong();
        noiCong.setTenKyNang("Nội Công");
        noiCong.setSatThuong(600);
        noiCong.setThuocTinh("Thuộc tính là cái gì đó");
        noiCong.setMoTa("Mô tả something về Nội công :))))");

        KyNang ngoaiCong = new NgoaiCong();
        ngoaiCong.setTenKyNang("Vịnh Xuân Quyền");
        ngoaiCong.setSatThuong(500);
        ngoaiCong.setThuocTinh("Thuộc tính của Vịnh Xuân Quyền");
        ngoaiCong.setMoTa("là một môn võ thuật có nguồn gốc từ Nam Thiếu Lâm tại tỉnh Phúc Kiến, Trung Quốc.");

        KyNang kyNangLuyen = new KyNang();
        kyNangLuyen.setTenKyNang("Kỹ Năng luyện vũ khí");
        kyNangLuyen.setSatThuong(0);
        kyNangLuyen.setThuocTinh("Luyện vũ khí");
        kyNangLuyen.setMoTa("Luyện Vũ khí");
        kyNangLuyen.toString();

        ThieuLam thieuLam = new ThieuLam();
        thieuLam.setTenMonPhai("Vịnh Xuân Quyền");
        thieuLam.setTenTruongMon("Diệp Vấn");
        thieuLam.setNoiO("Chùa Nam Thiếu Lâm");
        thieuLam.setKyNang(ngoaiCong);
        thieuLam.setMonQuy("Nội Quy của Vịnh Xuân Quyền");
        thieuLam.setMoTa("Mô tả something...");

        thieuLam.anUong("Cơm","trưa","HongKong");
        thieuLam.luyenCong("Thiếu lâm côn pháp", kyNangLuyen);
        thieuLam.inTTMonPhai();
        // Cái Bang:
        CaiBang caiBang = new CaiBang();
        caiBang.setTenMonPhai("Cái Bang");
        caiBang.setTenTruongMon("Trưởng lão");
        caiBang.setNoiO("Nơi nào có ăn xin, nơi đó có cái bang");
        caiBang.setKyNang(noiCong);
        caiBang.setMonQuy("Môn Quy của Cái Bang");
        caiBang.setMoTa("Mô tả something...");

        caiBang.anUong("Màn Thầu thiu","trưa","xó chợ");
        caiBang.luyenCong("Đả cầu bổng", kyNangLuyen);
        caiBang.inTTMonPhai();

        caiBang.soTai(thieuLam);

    }
}