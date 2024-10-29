package com.example.listview;

public class Item2 {
    private int GiaTien, GiaAo;
    int Image;
    private String TenMonAn;

    public int getGiaTien() {
        return GiaTien;
    }

    public void setGiaTien(int giaTien) {
        GiaTien = giaTien;
    }

    public int getGiaAo() {
        return GiaAo;
    }

    public void setGiaAo(int giaAo) {
        GiaAo = giaAo;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTenMonAn() {
        return TenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        TenMonAn = tenMonAn;
    }
    public Item2(String TenMonAn, int GiaTien, int GiaAo, int image)
    {
        this.TenMonAn = TenMonAn;
        this.GiaTien =GiaTien;
        this.GiaAo = GiaAo;
        Image = image;
    }

}
