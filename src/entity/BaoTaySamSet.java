package entity;

public class BaoTaySamSet extends VatPham {

    public BaoTaySamSet() {
        this.soVangQuyDoi = 7;
    }

    public BaoTaySamSet(int chiSoSM, float heSoSM) {
        super(chiSoSM, heSoSM, 7);

    }

    @Override
    public String toString() {
        return "BaoTaySamSet{" +
                " chiSoSM=" + chiSoSM +
                ", heSoSM=" + heSoSM +
                ", soVangQuyDoi=" + soVangQuyDoi +
                ", sucCongPha=" + sucCongPha() +
                ", giaMua=" + giaMua() +
                '}';
    }

}
