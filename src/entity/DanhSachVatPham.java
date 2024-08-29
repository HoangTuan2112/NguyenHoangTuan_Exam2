package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachVatPham {
    List<VatPham> danhSachVatPham;

    public DanhSachVatPham() {
        danhSachVatPham = new ArrayList<>();
    }

    public void cau1() {
        System.out.println("cau 1");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin 5 vat pham vat pham: ");
        String tenVatPham = "";
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                tenVatPham = "Chiec Bua Than";
            } else if (i == 1) {
                tenVatPham = "Hon Da Kich No";
            } else if (i == 2) {
                tenVatPham = "Cay Riu Phep Thuat";
            } else if (i == 3) {
                tenVatPham = "Bao Tay Sam Set";
            } else {
                tenVatPham = "Cay Gay Chien Than";
            }
            System.out.println("Nhap thong tin " + tenVatPham + ": ");
            int chiSoSM = 0;
            boolean check = true;
            System.out.print("Chi so SM: ");
            try {
                while (check) {
                    chiSoSM = sc.nextInt();
                    if (chiSoSM > 0) {
                        check = false;
                    } else {
                        System.out.println("Chi so SM phai tu lon hon 0");
                        System.out.println("Nhap lai chi so SM: ");
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException("Nhap sai kieu du lieu chi so SM (phai la so nguyen)");
            }


            System.out.print("He so SM: ");
            float heSoSM = 0;
            try {

                heSoSM = sc.nextFloat();

            } catch (Exception e) {
                throw new RuntimeException("Nhap sai kieu du lieu he so SM (phai la so thuc)");
            }
            if (i == 0) {
                danhSachVatPham.add(new ChiecBuaThan(chiSoSM, heSoSM));
            } else if (i == 1) {
                danhSachVatPham.add(new HonDaKichNo(chiSoSM, heSoSM));
            } else if (i == 2) {
                danhSachVatPham.add(new CayRiuPhepThuat(chiSoSM, heSoSM));
            } else if (i == 3) {
                danhSachVatPham.add(new BaoTaySamSet(chiSoSM, heSoSM));
            } else {
                danhSachVatPham.add(new CayGayChienThan(chiSoSM, heSoSM));
            }


        }

        System.out.println("=========================================");
    }

    public void cau2() {
        System.out.println("cau 2");
        System.out.println("============Danh sach vat pham============");
        for (VatPham vatPham : danhSachVatPham) {
            System.out.println(vatPham.toString());
        }
        System.out.println("=========================================");
    }

    public float maxXu() {
        return danhSachVatPham.stream()
                .reduce((vatPham1, vatPham2) -> vatPham1.giaMua() > vatPham2.giaMua() ? vatPham1 : vatPham2)
                .get().giaMua();


    }

    public void cau3() {
        System.out.println("cau 3");
        System.out.println("============Danh sach vat pham co gia mua cao nhat============");
        List<VatPham> vatPhamList = new ArrayList<>();
        float max = maxXu();
        for (VatPham vatPham : danhSachVatPham) {
            if (vatPham.giaMua() == max) {
                vatPhamList.add(vatPham);
            }
        }

        for (VatPham vp : vatPhamList) {
            System.out.println(vp.toString());
        }
        System.out.println("=========================================");


    }

    public float tongGiaCan() {
        return danhSachVatPham.stream()
                .map(VatPham::giaMua)
                .reduce(0.0f, Float::sum);
    }

    public void cau4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("cau 4");
        System.out.println("Nhap xu ma Spon da thu duoc");
        float xu = sc.nextFloat();
        System.out.println("Tong gia can de mua tat ca cac vat pham"+tongGiaCan());

        if (tongGiaCan() <= xu) {
            System.out.println("Spon co the giai cuu");
        } else {
            System.out.println("Spon khong the giai cuu can bo sung them " + (tongGiaCan() - xu) + " xu");
        }
        System.out.println("=========================================");
    }
}
