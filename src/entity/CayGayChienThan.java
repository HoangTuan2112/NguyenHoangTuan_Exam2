package entity;

public class CayGayChienThan extends VatPham{
    public CayGayChienThan() {
        this.soVangQuyDoi = 7;
    }

    public CayGayChienThan( int chiSoSM, float heSoSM) {
        super( chiSoSM, heSoSM,7);

    }
    @Override
    public String toString() {
        return "CayGayChienThan{" +

                " chiSoSM=" + chiSoSM +
                ", heSoSM=" + heSoSM +
                ", soVangQuyDoi=" + soVangQuyDoi +
                ", sucCongPha=" + sucCongPha() +
                ", giaMua=" + giaMua()  +
                '}';
    }
}
