package entity;

public class CayRiuPhepThuat extends VatPham{
    public CayRiuPhepThuat() {
        this.soVangQuyDoi = 10;
    }

    public CayRiuPhepThuat( int chiSoSM, float heSoSM) {
        super( chiSoSM, heSoSM,10);

    }
    @Override
    public String toString() {
        return "CayRiuPhepThuat{" +

                " chiSoSM=" + chiSoSM +
                ", heSoSM=" + heSoSM +
                ", soVangQuyDoi=" + soVangQuyDoi +
                ", sucCongPha=" + sucCongPha() +
                ", giaMua=" + giaMua()  +
                '}';
    }
}
