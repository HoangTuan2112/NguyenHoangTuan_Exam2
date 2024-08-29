package entity;

public class ChiecBuaThan extends VatPham{
    public ChiecBuaThan() {
        this.soVangQuyDoi = 10;
    }

    public ChiecBuaThan( int chiSoSM, float heSoSM) {
        super( chiSoSM, heSoSM,10);

    }

    @Override
    public String toString() {
        return "ChiecBuaThan{" +

                " chiSoSM=" + chiSoSM +
                ", heSoSM=" + heSoSM +
                ", soVangQuyDoi=" + soVangQuyDoi +
                ", sucCongPha=" + sucCongPha() +
                ", giaMua=" + giaMua()  +
                '}';
    }
}
