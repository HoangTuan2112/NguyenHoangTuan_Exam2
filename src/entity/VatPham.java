package entity;

public class VatPham {

    protected int chiSoSM;
    protected float heSoSM;
    protected float soVangQuyDoi;

    public float sucCongPha() {
        return chiSoSM * heSoSM;
    }
    public float giaMua() {
        return sucCongPha() * soVangQuyDoi;
    }

    public VatPham() {
    }

    public VatPham( int chiSoSM, float heSoSM, float soVangQuyDoi) {

        this.chiSoSM = chiSoSM;
        this.heSoSM = heSoSM;
        this.soVangQuyDoi = soVangQuyDoi;
    }


    public int getChiSoSM() {
        return chiSoSM;
    }

    public void setChiSoSM(int chiSoSM) {
        this.chiSoSM = chiSoSM;
    }

    public float getHeSoSM() {
        return heSoSM;
    }

    public void setHeSoSM(float heSoSM) {
        this.heSoSM = heSoSM;
    }

    public float getsoVangQuyDoi() {
        return soVangQuyDoi;
    }

    public void setsoVangQuyDoi(float soVangQuyDoi) {
        this.soVangQuyDoi = soVangQuyDoi;
    }

    @Override
    public String toString() {
        return "VatPham{" +
                " chiSoSM=" + chiSoSM +
                ", heSoSM=" + heSoSM +
                ", soVangQuyDoi=" + soVangQuyDoi +
                ", sucCongPha=" + sucCongPha() +
                ", giaMua=" + giaMua() +
                '}';
    }
}
