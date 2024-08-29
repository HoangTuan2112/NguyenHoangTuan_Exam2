package entity;

public class HonDaKichNo extends VatPham {
    public HonDaKichNo() {
        this.soVangQuyDoi = 12;
    }

    public HonDaKichNo(int chiSoSM, float heSoSM) {
        super(chiSoSM, heSoSM, 12);

    }

    @Override
    public String toString() {
        return "HonDaKichNo{" +

                " chiSoSM=" + chiSoSM +
                ", heSoSM=" + heSoSM +
                ", soVangQuyDoi=" + soVangQuyDoi +
                ", sucCongPha=" + sucCongPha() +
                ", giaMua=" + giaMua() +
                '}';
    }
}
